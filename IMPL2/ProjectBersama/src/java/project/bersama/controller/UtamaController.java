/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.controller;

import java.util.List;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.bersama.dto.DataDto;
import project.bersama.service.Data1Service;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {
    
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
