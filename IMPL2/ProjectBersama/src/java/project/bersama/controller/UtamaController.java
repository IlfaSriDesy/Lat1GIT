/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.controller;
import com.google.gson.Gson;
import java.util.List;
import java.util.List;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.bersama.dto.TampMainDto;
import project.bersama.dto.foodCategoryDto;
import project.bersama.dto.foodProductDto;
import project.bersama.service.foodCategoryService;
import project.bersama.service.foodProductService;
import project.bersama.dao.transaksipointDao;

import project.bersama.dto.transaksipointDto;
import project.bersama.dto.Grup2Dto;
import project.bersama.service.Grup2Service;
import project.bersama.dto.MemberDto;
import project.bersama.service.MemberService;
import project.bersama.dto.DataDto;
import project.bersama.service.Data1Service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import project.bersama.dto.FoodDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.portlet.ModelAndView;
import project.bersama.dto.PhotoDto;
import project.bersama.service.FoodService;
import project.bersama.service.PhotoService;
import project.bersama.service.transaksipointService;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {

    @Autowired
    FoodService foodService;
    
    @Autowired
    foodProductService foodProductService;

    @Autowired
    foodCategoryService foodCategoryService;

    @Autowired
    transaksipointService transService;

    @Autowired
    Grup2Service grup2service;
    
    @Autowired
    MemberService memberService;
    

    
    @Autowired
    Data1Service data1Service;
    
 
    @Autowired
    PhotoService photoService;
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewIndex() {
        return "index";
    }

    @RequestMapping(value = "/layar1", method = RequestMethod.GET)
    public String viewLayar1() {
        return "layar1";
    }
    @RequestMapping(value = "/layar4", method = RequestMethod.GET)
    public String viewLayar4(){
        return "layar4";
    }
    @RequestMapping(value = "/getlist1", method = RequestMethod.GET)
    @ResponseBody
    public String getListfood() throws Exception {
        List<FoodDto> listMajor = foodService.getListDataFood();
        return new Gson().toJson(listMajor);
    }

    @RequestMapping(value = "/layar6", method = RequestMethod.GET)
    public String viewLayar6(ModelMap model) throws Exception {
        List<foodCategoryDto> listCategory = foodCategoryService.getListFoodCategory();
        model.addAttribute("listCategory", listCategory);
        List<foodProductDto> listProduct = foodProductService.getListFoodProduct();
        model.addAttribute("listProduct", listProduct);
        return "layar6";
    }

    @RequestMapping(value = "/getDataProductByCategory", method = RequestMethod.GET)
    @ResponseBody
    public String getDataProductByCategory(String foodCategory_id) {
        List<foodProductDto> listProduct = foodProductService.getFoodProductById(foodCategory_id);
        return new Gson().toJson(listProduct);
    }

    @RequestMapping(value = "/getProduct2", method = RequestMethod.GET)
    @ResponseBody
    public String getProduct2(String Cat, String Prod) {
        List<TampMainDto> listNama = foodProductService.getNama(Cat, Prod);
        return new Gson().toJson(listNama);
    }

    public String viewLayar1(ModelMap model)throws Exception{
        try {
            List<MemberDto> data=memberService.getData();
            System.out.println(data);
            model.addAttribute("datamember", data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "layar1";
    }
    
    @RequestMapping(value = "/tabelTransaksi", method = RequestMethod.GET)
    public String tabelTransaksi(ModelMap model){
        try {
            List<transaksipointDto> listTransDto = transService.getListDataTransaksi();
            model.addAttribute("listTransDto", listTransDto);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return "layar3";
    }
  @RequestMapping(value = "/layar2", method = RequestMethod.GET)
    public String viewTabelPoint(ModelMap model){
       try {
            List<Grup2Dto> listDataDto = grup2service.getListPoint();
            model.addAttribute("listDataDto", listDataDto);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return "layar2";
    }
    

    @RequestMapping(value = "/layar7", method = RequestMethod.GET)
    public String viewLayar7() {
        return "layar7";
    }

    @RequestMapping(value = "/downloadExcelData1", method = RequestMethod.GET)
    public org.springframework.web.servlet.ModelAndView downloadExcelData1(ModelMap model) throws Exception{
        List<DataDto> listDtoData = data1Service.getlistData1();
        System.out.println("Success to get the data");
        return new org.springframework.web.servlet.ModelAndView("excelDownloadExample", "listDtoData", listDtoData);
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
