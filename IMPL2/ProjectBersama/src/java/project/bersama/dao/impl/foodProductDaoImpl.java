/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao.impl;

import java.util.List;
import org.hibernate.Query;
import project.bersama.dao.foodProductDao;
import project.bersama.model.foodCategoryModel;
import project.bersama.model.foodProductModel;

/**
 *
 * @author LK
 */
public class foodProductDaoImpl extends HibernateUtil implements foodProductDao{

    @Override
    public List<foodProductModel> getListDataFoodProduct() throws Exception {
        List<foodProductModel> listData = null;
        try {
            String sql = "select model from foodProductModel model";
            Query query = createQuery(sql);
            listData = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    
    }

    @Override
    public List<foodProductModel> getFoodProductById(String param) throws Exception {
        List<foodProductModel> dataList = null;
        String sql = "select model from foodProductModel model where foodCategory_id=:param";
        Query query = createQuery(sql).setParameter("param", param);          
        dataList = query.list();
        return dataList;
    
    }

    @Override
    public foodProductModel getFoodProductModelById(String id) {
    foodProductModel jur = new foodProductModel();
        Query query = null;
        try {
            String sql = "select model from foodProductModel model where foodProduct_id=:idProd";
            query = createQuery(sql).setParameter("idProd", id);                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (foodProductModel) query.uniqueResult();  
    }
    
}
