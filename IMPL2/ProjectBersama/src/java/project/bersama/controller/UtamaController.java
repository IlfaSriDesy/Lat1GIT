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
import project.bersama.dto.MemberDto;
import project.bersama.service.MemberService;

/**
 *
 * @author ILFA SRI DESY
 */
@Controller
public class UtamaController {
    @Autowired
    MemberService memberService;
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewIndex(){
        return "index";
    }
    
    @RequestMapping(value = "/layar1", method = RequestMethod.GET)
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
}
