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
import project.bersama.dao.transaksipointDao;
import project.bersama.dto.transaksipointDto;
import project.bersama.model.transaksipoint_tbl;

import project.bersama.service.transaksipointService;

/**
 *
 * @author acer v5
 */

public class transaksipointServiceImpl implements transaksipointService{
    @Autowired
    transaksipointDao transaksii;
    
    @Override
    public List<transaksipointDto> getListDataTransaksi() throws Exception{
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<transaksipointDto> listDataDto = new ArrayList<>();
        List<transaksipoint_tbl> listData = null;
        try {
            listData = transaksii.getListDataTransaksi();
        } catch (Exception ex) {
            Logger.getLogger(transaksipointServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        transaksipointDto transaksipointDto = null;
        try {
            if (listData != null) {
                for (transaksipoint_tbl model : listData) {
                    transaksipointDto = new transaksipointDto();
                    if (model.getTrans_id()!= null) {
                        transaksipointDto.setTrans_id(model.getTrans_id());
                    }
                    if (model.getDate()!= null) {
                        transaksipointDto.setDate(model.getDate());
                    }
                    if (model.getMember_id()!= null) {
                        transaksipointDto.setMember_id(model.getMember_id());
                    }
                    if (model.getJnspoint_id()!= null) {
                        transaksipointDto.setJnspoint_id(model.getJnspoint_id());
                    }
                    if (model.getDesc()!= null) {
                        transaksipointDto.setDesc(model.getDesc());
                    }

                    listDataDto.add(transaksipointDto);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDataDto;
    }
    
}
