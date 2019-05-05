/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.bersama.dao;

import java.util.List;
import project.bersama.model.FoodModel;

/**
 *
 * @author Acer
 */
public interface FoodDao {
     public List<FoodModel> getListDataFood()throws Exception;
}
