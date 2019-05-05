/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.bersama.dao.PointDao;
import project.bersama.dto.Grup2Dto;
import project.bersama.model.Grup2Model;
import project.bersama.service.Grup2Service;
/**
 *
 * @author gadgethouse
 */
@Service
@Transactional
public class Grup2ServiceImpl implements Grup2Service{
    
    @Autowired
    PointDao dataDao;
    
  

    @Override
    public List<Grup2Dto> getListPoint() throws Exception {
          List<Grup2Dto> ListDto = new ArrayList<>();
        List<Grup2Model> data = dataDao.getLisPoint();
        Grup2Dto dataDto=null;
        try {
            data = dataDao.getLisPoint();
        } catch (Exception ex) {
            Logger.getLogger(Grup2ServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(data != null){
            for (Grup2Model ddm : data) {
                dataDto = new Grup2Dto();
                if(ddm.getJnspoint_id() != null){
                    dataDto.setJnspoint_id(ddm.getJnspoint_id());
                }
                
                if(ddm.getJnspoint_nm() != null){
                    dataDto.setJnspoint_nm(ddm.getJnspoint_nm());
                }
                
                dataDto.setJnspoint_nilai(ddm.getJnspoint_nilai());
                
                ListDto.add(dataDto);
            }
        }
        return ListDto;  }

   
 

    
}
