/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao.impl;

import java.util.List;
import org.hibernate.Query;
import project.bersama.dao.PointDao;
import project.bersama.model.Grup2Model;

/**
 *
 * @author ASUS
 */
public class PointDaoImpl extends HibernateUtil implements PointDao {

    @Override
    public List<Grup2Model> getLisPoint() throws Exception {
      List<Grup2Model> listData = null;
        try {
            String sql = "select model from Grup2Model model";
            Query query = createQuery(sql);
            listData = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    
}
