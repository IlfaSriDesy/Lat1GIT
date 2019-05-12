/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.bersama.dto.LayerDelapanDto;
import project.bersama.dto.pathimportDto;
import project.bersama.service.LayerDelapanService;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {
    
    @Autowired
    LayerDelapanService layerService;
    
     String tmpPath="";
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewIndex(){
        return "index";
    }
    
    @RequestMapping(value = "/layar1", method = RequestMethod.GET)
    public String viewLayar1(){
        return "layar1";
    }
    
    
    @RequestMapping(value = "/importData", method = RequestMethod.GET)
    public String viewImportData(ModelMap model){
        pathimportDto importDto = new pathimportDto();
        model.addAttribute("importDto", importDto);
        return "Layar8";
    }
    
    @RequestMapping(value = "/uploadDataDua", method = RequestMethod.POST)
    public String uploadDataDua(pathimportDto importDto, ModelMap model) throws Exception {
        if (!importDto.getFile().isEmpty()) {
//            try {
            byte[] bytes = importDto.getFile().getBytes();

            // Creating the directory to store file
            String rootPath = "C:\\";
            File dir = new File(rootPath);//rootPath itu url nya..
            if (!dir.exists()) {
                dir.mkdirs();//mkdirs() untuk membuat sebuah direktori baru, terdapat pd klas file
            }

            File serverFile = new File(dir.getAbsolutePath()
                    + File.separator + importDto.getFile().getOriginalFilename());
            BufferedOutputStream stream = new BufferedOutputStream(
                    new FileOutputStream(serverFile));//pembacaan data binary dari sebuah file
            stream.write(bytes);
            stream.close();
        }
        String rootPath = "C:\\" + importDto.getPath();
        tmpPath = rootPath;
        model.addAttribute("importDto", importDto);
        List<LayerDelapanDto> listDto = layerService.getListDataExcelData(rootPath);
        model.addAttribute("listDto", listDto);
        return "Layar8";
    }
    
    @RequestMapping(value = "/saveImportData", method = RequestMethod.GET)
    public String saveImportData(ModelMap model) throws Exception {
        try {
            pathimportDto importDto = new pathimportDto();
            model.addAttribute("importDto", importDto);
            
            layerService.saveDataExcelData(tmpPath);
            return "redirect:importData.htm?success=true";
        } catch (Exception e) {
            return "redirect:importData.htm?success=false";
        }

    }
    
}
