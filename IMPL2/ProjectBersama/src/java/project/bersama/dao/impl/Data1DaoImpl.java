/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao.impl;

import java.util.List;
import org.hibernate.Query;
import project.bersama.dao.Data1Dao;
import project.bersama.model.DataModel;

/**
 *
 * @author Lenovo
 */
public class Data1DaoImpl extends HibernateUtil implements Data1Dao {

    @Override
    public List<DataModel> getListData1() throws Exception {
        List<DataModel> listData = null;
        try {
            String sql = "select model from DataModel model";
            Query query = createQuery(sql);
            listData = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }

}
