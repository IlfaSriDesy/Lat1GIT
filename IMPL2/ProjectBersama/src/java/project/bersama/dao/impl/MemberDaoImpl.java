/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao.impl;

import java.util.List;
import org.hibernate.Query;
import project.bersama.dao.MemberDao;
import project.bersama.dto.MemberDto;
import project.bersama.model.MemberModel;

/**
 *
 * @author HP
 */
public class MemberDaoImpl extends HibernateUtil implements MemberDao{

    @Override
    public List<MemberModel> getAllMember() throws Exception {
        List<MemberModel> data=null;
        try {
            String quer="select model from MemberModel model";
            Query qq=createQuery(quer);
            data=qq.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    
}
