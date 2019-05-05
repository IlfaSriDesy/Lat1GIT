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
import project.bersama.service.transaksipointService;
import project.bersama.dto.Grup2Dto;
import project.bersama.service.Grup2Service;
import project.bersama.dto.MemberDto;
import project.bersama.service.MemberService;
import project.bersama.dto.DataDto;
import project.bersama.service.Data1Service;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {

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


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewIndex() {
        return "index";
    }

    @RequestMapping(value = "/layar1", method = RequestMethod.GET)
    public String viewLayar1() {
        return "layar1";
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
}
