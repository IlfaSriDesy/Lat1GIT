/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.bersama.dto.FoodDto;
import project.bersama.model.FoodModel;
import project.bersama.service.FoodService;
import projek.bersama.dao.FoodDao;

/**
 *
 * @author Acer
 */

@Service
@Transactional
public class FoodServiceImpl implements FoodService{
    @Autowired 
    FoodDao foodDao;
    @Override
    public List<FoodDto> getListDataFood() throws Exception {
        List <FoodDto> listDataDto = new ArrayList<>();
        List <FoodModel> listData = foodDao.getListDataFood();
        FoodDto foodDto = null;
        try {
            if(listData != null){
                for(FoodModel model : listData){
                    foodDto = new FoodDto();
                    if(model.getFoodId()!= null){
                        foodDto.setFoodId(model.getFoodId());
                    }
                    if(model.getFoodNm()!= null){
                        foodDto.setFoodNm(model.getFoodNm());
                    }
                     if(model.getFoodSpec()!= null){
                        foodDto.setFoodSpec(model.getFoodSpec());
                    }
                    
                    listDataDto.add(foodDto);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return listDataDto;
    }

    
}
