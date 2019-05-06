/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao;

import java.util.List;
import project.bersama.model.foodProductModel;

/**
 *
 * @author LK
 */
public interface foodProductDao {
    public List<foodProductModel> getListDataFoodProduct()throws Exception;
    public List<foodProductModel> getFoodProductById(String param) throws Exception;
    public foodProductModel getFoodProductModelById(String id);

}
