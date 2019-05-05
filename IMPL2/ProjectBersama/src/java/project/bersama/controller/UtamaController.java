/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.controller;

import com.google.gson.Gson;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import project.bersama.dto.FoodDto;
import project.bersama.service.FoodService;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {
    @Autowired
    FoodService foodService;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewIndex(){
        return "index";
    }
    
    @RequestMapping(value = "/layar1", method = RequestMethod.GET)
    public String viewLayar1(){
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
    
}
