/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao.impl;

import java.util.List;
import org.hibernate.Query;
import project.bersama.dao.FoodDao;
import project.bersama.model.FoodModel;

/**
 *
 * @author Acer
 */
public class FoodDaoImpl extends HibernateUtil implements FoodDao{

    @Override
    public List<FoodModel> getListDataFood() throws Exception {
        List<FoodModel> listData = null;
        try {
            String sql = "select model from FoodModel model";
            Query query = createQuery(sql);
            listData = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    
}
