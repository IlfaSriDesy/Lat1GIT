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
import project.bersama.dto.TampMainDto;
import project.bersama.dto.foodCategoryDto;
import project.bersama.dto.foodProductDto;
import project.bersama.service.foodCategoryService;
import project.bersama.service.foodProductService;

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

}
