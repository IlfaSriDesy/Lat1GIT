/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.bersama.dao.FoodDao;
import project.bersama.dto.FoodDto;
import project.bersama.model.FoodModel;
import project.bersama.service.FoodService;

/**
 *
 * @author Acer
 */
@Service
@Transactional
public class FoodServiceImpl implements FoodService{
    @Autowired
    FoodDao datafood;

    @Override
    public List<FoodDto> getListFood() throws Exception {
     List <FoodDto> dataFoodDto = new ArrayList<>();
     List <FoodModel> data=datafood.getListFood();
     FoodDto dtoFood=null;
        try {
            data =datafood.getListFood();
        } catch (Exception e) {
            Logger.getLogger(FoodServiceImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        if (data != null){
            for (FoodModel fdata :data){
                dtoFood=new FoodDto();
                if(fdata.getFood_id() != null){
                    dtoFood.setFood_id(fdata.getFood_id());
                }
                if(fdata.getFood_nm() !=null){
                    dtoFood.setFood_nm(fdata.getFood_nm());
                }
                if(fdata.getFood_desc() != null){
                   dtoFood.setFood_desc(fdata.getFood_desc());
                }
            
                dataFoodDto.add(dtoFood);
            }
            
        
        }
        return dataFoodDto;
     
    }
    
    
}
