/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.daoImpl;

import project.bersama.dao.PhotoDao;
import project.bersama.model.Photo;

/**
 *
 * @author Nina M Aida
 */
public class PhotoDaoImpl extends HibernateUtil implements PhotoDao{

    @Override
    public void saveDataPhoto(Photo photoModel) throws Exception {
        try {
            getSession().save(photoModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
