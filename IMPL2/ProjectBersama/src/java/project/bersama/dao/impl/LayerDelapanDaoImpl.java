/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao.impl;

import java.util.List;
import org.hibernate.Query;
import project.bersama.dao.LayerDelapanDao;
import project.bersama.dto.LayerDelapanDto;
import project.bersama.model.LayerDelapan;

/**
 *
 * @author ASUS
 */
public class LayerDelapanDaoImpl extends HibernateUtil implements LayerDelapanDao{

    @Override
    public List<LayerDelapan> getListDataDua() throws Exception {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     List<LayerDelapan> listData = null;
        try {
            String sql = "select model from LayerDelapan model";
            Query query = createQuery(sql);
            listData = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }

    @Override
    public List<LayerDelapan> getDataById(String kdproduk) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LayerDelapan getDataModelById(String id) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         LayerDelapan lay = new LayerDelapan();
        Query query = null;
        try {
            String sql = "select model from LayerDelapan model where data2_id=:Data_id";
            query = createQuery(sql).setParameter("Data_id", id);                    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (LayerDelapan) query.uniqueResult(); 
    }

    @Override
    public void updateDua(LayerDelapan datamodel) {
        if(datamodel.getData2_id()!= null){
            getSession().merge(datamodel);
        }else{
            getSession().saveOrUpdate(datamodel);
        }
    }

    @Override
    public void saveDataDua(LayerDelapan datamodel) {
        getSession().save(datamodel);
    }

    
    
}
