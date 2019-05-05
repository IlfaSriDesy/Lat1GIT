/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import project.bersama.dto.Grup2Dto;
import project.bersama.service.Grup2Service;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {
    @Autowired
    Grup2Service grup2service;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewIndex(){
        return "index";
    }
    
    @RequestMapping(value = "/layar1", method = RequestMethod.GET)
    public String viewLayar1(){
        return "layar1";
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
    
}
