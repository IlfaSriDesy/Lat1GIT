/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service.impl;

import com.google.gson.Gson;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import project.bersama.dao.LayerDelapanDao;

import project.bersama.dto.LayerDelapanDto;
import project.bersama.model.LayerDelapan;
import project.bersama.service.LayerDelapanService;

/**
 *
 * @author ASUS
 */
public class LayerDelapanImpl implements LayerDelapanService {

    @Autowired
    LayerDelapanDao layerDao;

    @Override
    public List<LayerDelapanDto> getListDataDua() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<LayerDelapanDto> ListDto = new ArrayList<>();
        List<LayerDelapan> data = null;
        try {
            data = layerDao.getListDataDua();
        } catch (Exception ex) {
            Logger.getLogger(LayerDelapanImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (data != null) {
            for (LayerDelapan ddm : data) {
                LayerDelapanDto dto = new LayerDelapanDto();
                if (ddm.getData2_id() != null) {
                    dto.setData2_id(ddm.getData2_id());
                }
                if (ddm.getKd_produk() != null) {
                    dto.setKd_produk(ddm.getKd_produk());
                }
                if (ddm.getNm_produk() != null) {
                    dto.setNm_produk(ddm.getNm_produk());
                }
                if (ddm.getKategori_produk() != null) {
                    dto.setKategori_produk(ddm.getKategori_produk());
                }
               
                    dto.setStok(ddm.getStok());
                
                ListDto.add(dto);
            }
        }
        return ListDto;
    }

    @Override
    public List<LayerDelapanDto> getDataById(String data2_id) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }

    @Override
    public List<LayerDelapanDto> getListDataExcelData(String path) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<LayerDelapanDto> result = new ArrayList<>();
        try {
            FileInputStream input = new FileInputStream(path);
            HSSFWorkbook wb = new HSSFWorkbook(input);

            HSSFSheet sheet = wb.getSheetAt(0);
            Row row;

            for (int i = 1; i <= (sheet.getLastRowNum()); i++) {
                row = sheet.getRow(i);
                LayerDelapanDto dto = new LayerDelapanDto();

                if (row.getCell(1) != null) {
                    dto.setData2_id(row.getCell(1).getStringCellValue());
                }
                if (row.getCell(2) != null) {
                    dto.setKd_produk(row.getCell(2).getStringCellValue());
                }

                if (row.getCell(3) != null) {
                    dto.setNm_produk(row.getCell(3).getStringCellValue());
                }
                if (row.getCell(4) != null) {
                    dto.setKategori_produk(row.getCell(4).getStringCellValue());
                }
                if (row.getCell(5) != null) {
                    dto.setStok(row.getCell(5).getNumericCellValue());
                }

                result.add(dto);
            }
            System.out.println(new Gson().toJson(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void saveDataExcelData(String path) throws Exception {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        List<LayerDelapanDto> result = new ArrayList<>();
        try {
            FileInputStream input = new FileInputStream(path);
            HSSFWorkbook wb = new HSSFWorkbook(input);

            HSSFSheet sheet = wb.getSheetAt(0);
            Row row;

            for (int i = 1; i <= (sheet.getLastRowNum()); i++) {
                row = sheet.getRow(i);
                LayerDelapanDto dto = new LayerDelapanDto();

                if (row.getCell(1) != null) {
                    dto.setData2_id(row.getCell(1).getStringCellValue());
                }
                if (row.getCell(2) != null) {
                    dto.setKd_produk(row.getCell(2).getStringCellValue());
                }

                if (row.getCell(3) != null) {
                    dto.setNm_produk(row.getCell(3).getStringCellValue());
                }

                if (row.getCell(4) != null) {
                    dto.setKategori_produk(row.getCell(4).getStringCellValue());
                }

                if (row.getCell(5) != null) {
                      dto.setStok(row.getCell(5).getNumericCellValue());
                }

                result.add(dto);
            }
            System.out.println(new Gson().toJson(result));

            if (result.size() > 0) {
                for (LayerDelapanDto dto : result) {
                    LayerDelapan dataModel = layerDao.getDataModelById(dto.getData2_id());
                    if (dataModel == null) {
                        saveDataDua(dto);
                    } else {
                        doUpdateDataData(dto);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doUpdateDataData(LayerDelapanDto data) throws Exception {
        LayerDelapan dataModel = new LayerDelapan();
        try {
            dataModel.setData2_id(data.getData2_id());
            dataModel.setKd_produk(data.getKd_produk());
            dataModel.setNm_produk(data.getNm_produk());
            dataModel.setKategori_produk(data.getKategori_produk());
            dataModel.setStok(data.getStok());
        } catch (Exception e) {
            e.printStackTrace();
        }
        layerDao.updateDua(dataModel);
    }

    @Override
    public void saveDataDua(LayerDelapanDto data) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        LayerDelapan dataModel = new LayerDelapan();
        dataModel.setData2_id(data.getData2_id());
        dataModel.setKd_produk(data.getKd_produk());
        dataModel.setNm_produk(data.getNm_produk());
        dataModel.setKategori_produk(data.getKategori_produk());
        dataModel.setStok(data.getStok());

        layerDao.saveDataDua(dataModel);
    }

}
