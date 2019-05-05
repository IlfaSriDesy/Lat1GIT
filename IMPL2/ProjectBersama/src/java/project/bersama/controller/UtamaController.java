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
import project.bersama.dao.transaksipointDao;
import project.bersama.dto.transaksipointDto;
import project.bersama.service.transaksipointService;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {
    @Autowired
    transaksipointService transService;
    
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewIndex(){
        return "index";
    }
    
    @RequestMapping(value = "/layar1", method = RequestMethod.GET)
    public String viewLayar1(){
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
}
