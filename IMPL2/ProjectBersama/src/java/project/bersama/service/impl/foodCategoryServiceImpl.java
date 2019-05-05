/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import project.bersama.dao.foodCategoryDao;
import project.bersama.dto.foodCategoryDto;
import project.bersama.model.foodCategoryModel;
import project.bersama.service.foodCategoryService;

/**
 *
 * @author LK
 */
public class foodCategoryServiceImpl implements foodCategoryService{

    @Autowired
    foodCategoryDao foodCategoryDao;
    
    @Override
    public List<foodCategoryDto> getListFoodCategory() throws Exception {
        List <foodCategoryDto> listDataDto = new ArrayList<>();
        List <foodCategoryModel> listData = foodCategoryDao.getListDataFoodCategory();
        foodCategoryDto foodCategoryDto = null;
        try {
            if(listData != null){
                for(foodCategoryModel model : listData){
                    foodCategoryDto = new foodCategoryDto();
                    if(model.getFoodCategory_id()!= null){
                        foodCategoryDto.setFoodCategory_id(model.getFoodCategory_id());
                    }
                    if(model.getFoodCategory_nm()!= null){
                        foodCategoryDto.setFoodCategory_nm(model.getFoodCategory_nm());
                    }
                    
                    listDataDto.add(foodCategoryDto);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return listDataDto;
    
    }
    
}
