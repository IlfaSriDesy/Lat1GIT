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
import project.bersama.dao.Data1Dao;
import project.bersama.dto.DataDto;
import project.bersama.model.DataModel;
import project.bersama.service.Data1Service;

/**
 *
 * @author Lenovo
 */
public class Data1ServiceImpl implements Data1Service {

    @Autowired
    Data1Dao data1Dao;

    @Override
    public List<DataDto> getlistData1() {
        List<DataDto> ListDto = new ArrayList<>();
        List<DataModel> data = null;
        try {
            data = data1Dao.getListData1();
        } catch (Exception ex) {
            Logger.getLogger(Data1ServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (data != null) {
            for (DataModel ddm : data) {
                DataDto dto = new DataDto();
                if (ddm.getData1_id() != null) {
                    dto.setId(ddm.getData1_id());
                }
                if (ddm.getNama() != null) {
                    dto.setNama(ddm.getNama());
                }
                if (ddm.getTempat_lahir() != null) {
                    dto.setTempat_lahir(ddm.getTempat_lahir());
                }
                if (ddm.getTanggal_lahir() != null) {
                    dto.setTanggal_lahir(ddm.getTanggal_lahir());
                }
                if (ddm.getProfesi() != null) {
                    dto.setProfesi(ddm.getProfesi());
                }
                if (ddm.getAlamat() != null) {
                    dto.setAlamat(ddm.getAlamat());
                }
                if (ddm.getNope()!= null) {
                    dto.setNope(ddm.getNope());
                }
                if (ddm.getEmail()!= null) {
                    dto.setEmail(ddm.getEmail());
                }
                ListDto.add(dto);
            }
        }
        return ListDto;
    }

}
