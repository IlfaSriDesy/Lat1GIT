/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service;

import java.util.List;
import project.bersama.dto.TampMainDto;
import project.bersama.dto.foodProductDto;

/**
 *
 * @author LK
 */
public interface foodProductService {
    public List <foodProductDto> getListFoodProduct()throws Exception;
    public List<foodProductDto> getFoodProductById(String param);
    public List<TampMainDto> getNama(String Cat, String Prod);
    
}
