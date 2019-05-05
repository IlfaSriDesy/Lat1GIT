/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao.impl;

import java.util.List;
import org.hibernate.Query;
import project.bersama.dao.transaksipointDao;
import project.bersama.model.transaksipoint_tbl;

/**
 *
 * @author acer v5
 */
public class transaksipointDaoImpl extends HibernateUtil implements transaksipointDao{
    

    @Override
    public List<transaksipoint_tbl> getListDataTransaksi() throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<transaksipoint_tbl> listData = null;
        try {
            String sql = "select model from transaksipoint_tbl model";
            Query query = createQuery(sql);
            listData = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
}
