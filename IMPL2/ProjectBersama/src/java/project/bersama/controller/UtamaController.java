/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;
import project.bersama.dto.PhotoDto;
import project.bersama.dto.UploadFotoDto;
import project.bersama.service.PhotoService;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {
    @Autowired
    PhotoService photoService;
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewIndex(){
        return "index";
    }
    
    @RequestMapping(value = "/layar1", method = RequestMethod.GET)
    public String viewLayar1(){
        return "layar1";
    }
    
//    @RequestMapping(value = "/layar5", method = RequestMethod.GET)
//    public String viewLayar5(){
//        return "layar5";
//    }
    
    @RequestMapping(value = "/layar5", method = RequestMethod.GET)
    public String viewLat5(ModelMap model){
        PhotoDto dto= new PhotoDto();
        model.addAttribute("dtoupload", dto);
        return "layar5";
    }
    
    @RequestMapping(value = "/saveUpload", method = RequestMethod.POST)//
    public @ResponseBody String saveUploadFoto(@ModelAttribute PhotoDto dto, ModelMap model) {
    
        if (!dto.getFile().isEmpty()) {
            try {
                byte[] bytes = dto.getFile().getBytes();

                // Creating the directory to store file
                String rootPath = "C:\\Foto" ;
                File dir = new File(rootPath);//rootPath itu url nya..
                if (!dir.exists())
                        dir.mkdirs();//mkdirs() untuk membuat sebuah direktori baru, terdapat pd klas file
                
                File serverFile = new File(dir.getAbsolutePath()
                                + File.separator + dto.getFile().getOriginalFilename());
                BufferedOutputStream stream = new BufferedOutputStream(
                                new FileOutputStream(serverFile));//pembacaan data binary dari sebuah file
                stream.write(bytes);
                stream.close();                  
                ModelAndView mdl = new ModelAndView();
                photoService.saveDataPhoto(dto);  
                return "sukses upload file" + dto.getFile().getName();
                
            } catch (Exception e) {
                    return "gagal upload " + dto.getFile().getName() + " => " + e.getMessage();
            }
        } else {
                return "file kosong " + dto.getFile().getName();
        }
    }
    
}
