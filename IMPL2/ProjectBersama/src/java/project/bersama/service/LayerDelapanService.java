/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service;

import java.util.List;
import project.bersama.dto.LayerDelapanDto;

/**
 *
 * @author ASUS
 */
public interface LayerDelapanService {
    public List<LayerDelapanDto> getListDataDua();
    public List<LayerDelapanDto> getDataById(String data2_id);
    public List<LayerDelapanDto> getListDataExcelData(String path);
    public void saveDataExcelData(String path) throws Exception;
    public void doUpdateDataData(LayerDelapanDto data) throws Exception;
    public void saveDataDua(LayerDelapanDto data) throws Exception;
}
