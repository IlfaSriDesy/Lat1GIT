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
import project.bersama.dao.foodCategoryDao;
import project.bersama.dao.foodProductDao;
import project.bersama.dto.TampMainDto;
import project.bersama.dto.foodProductDto;
import project.bersama.model.foodCategoryModel;
import project.bersama.model.foodProductModel;
import project.bersama.service.foodProductService;

/**
 *
 * @author LK
 */
public class foodProductServiceImpl implements foodProductService {

    
    @Autowired
    foodProductDao foodProductDao;
    
    @Autowired
    foodCategoryDao foodCategoryDao;
    
    
    @Override
    public List<foodProductDto> getListFoodProduct() throws Exception {
        List <foodProductDto> listDataDto = new ArrayList<>();
        List <foodProductModel> listData = foodProductDao.getListDataFoodProduct();
        foodProductDto foodProductDto = null;
        try {
            if(listData != null){
                for(foodProductModel model : listData){
                    foodProductDto = new foodProductDto();
                    if(model.getFoodProduct_id()!= null){
                        foodProductDto.setFoodProduct_id(model.getFoodProduct_id());
                    }
                    if(model.getFoodProduct_nm()!= null){
                        foodProductDto.setFoodProduct_nm(model.getFoodProduct_nm());
                    }
                    if(model.getFoodCategory_id()!= null){
                        foodProductDto.setFoodCategory_id(model.getFoodCategory_id());
                    }
    
                    
                    listDataDto.add(foodProductDto);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return listDataDto;
    
    }

    @Override
    public List<foodProductDto> getFoodProductById(String param) {
    List<foodProductDto> ListDto = new ArrayList<>();
        List<foodProductModel> data = null;
        try {
            data = foodProductDao.getFoodProductById(param);
        } catch (Exception ex) {
            Logger.getLogger(foodProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(data != null){
            for (foodProductModel ddm : data) {
                foodProductDto dto = new foodProductDto();
                if(ddm.getFoodProduct_id() != null){
                    dto.setFoodProduct_id(ddm.getFoodProduct_id());
                }
                if(ddm.getFoodProduct_nm() != null){
                    dto.setFoodProduct_nm(ddm.getFoodProduct_nm());
                }
                if(ddm.getFoodCategory_id() != null){
                    dto.setFoodCategory_id(ddm.getFoodCategory_id());
                }
                ListDto.add(dto);
            }
        }
        return ListDto;
    }

    @Override
    public List<TampMainDto> getNama(String Cat, String Prod) {
    List<TampMainDto> ListDto = new ArrayList<>();
        foodProductModel dataprod = foodProductDao.getFoodProductModelById(Prod);
        foodCategoryModel datacat = foodCategoryDao.getFoodCategoryModelById(Cat);
        
        TampMainDto dto = new TampMainDto();
        dto.setKode(Cat);
        dto.setNama(datacat.getFoodCategory_nm());
        ListDto.add(dto);
        TampMainDto dto2 = new TampMainDto();
        dto2.setKode(Prod);
        dto2.setNama(dataprod.getFoodProduct_nm());
        ListDto.add(dto2);
        
        
        return ListDto;
    
    }
    
}
