/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao.impl;

import java.util.List;
import org.hibernate.Query;
import project.bersama.dao.foodCategoryDao;
import project.bersama.model.foodCategoryModel;

/**
 *
 * @author LK
 */
public class foodCategoryDaoImpl extends HibernateUtil implements foodCategoryDao{

    @Override
    public List<foodCategoryModel> getListDataFoodCategory() throws Exception {
        List<foodCategoryModel> listData = null;
        try {
            String sql = "select model from foodCategoryModel model";
            Query query = createQuery(sql);
            listData = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    
    }

    @Override
    public foodCategoryModel getFoodCategoryModelById(String id) {
    foodCategoryModel cat = new foodCategoryModel();
        Query query = null;
        try {
            String sql = "select model from foodCategoryModel model where foodCategory_id=:idCat";
            query = createQuery(sql).setParameter("idCat", id);                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (foodCategoryModel) query.uniqueResult();  
    }
    
}
