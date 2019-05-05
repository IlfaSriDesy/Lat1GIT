/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.excelBuilder;

import com.itextpdf.text.Font;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FontFormatting;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellUtil;
import org.springframework.web.servlet.view.document.AbstractExcelView;
import project.bersama.dto.DataDto;


/**
 *
 * @author Lenovo
 */
public class ExControllerExcelBuilder extends AbstractExcelView{

    @Override
    protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // get data model which is passed by the Spring container
        List<DataDto> listDtoData = (List<DataDto>) model.get("listDtoData");

        // create a new Excel sheet
        HSSFSheet sheet = workbook.createSheet("Daftar Data 1");
        sheet.setDefaultColumnWidth(30);
        CellRangeAddress mergedCell;
        mergedCell = new CellRangeAddress(0, 0, 0, 0);
        Map<String, Object> properties = new HashMap<>();
        properties.put(CellUtil.ALIGNMENT, HorizontalAlignment.LEFT);
//        properties = setStylePropertiesCenter();
        String header0[] = {"DAFTAR DATA 1"};
        String header1[] = {"UNIVERSITAS NASIONAL PASIM"};

//                String header3[]={"Filter Berdasarkan: "};
        
        
//                String header4[]={"Fakultas",""};
//                String header5[]={"Jurusan",""};
//                String header6[]={"Angkatan",""};
//                String header7[]={"Pengajuan",""};
        properties = setStylePropertiesCenter();
        mergedCell = new CellRangeAddress(0, 0, 0, 2);
        sheet.addMergedRegion(mergedCell);
        setValueRowHeader(sheet, 0, 0, header0, properties);
        mergedCell = new CellRangeAddress(1, 1, 0, 2);
        sheet.addMergedRegion(mergedCell);
        setValueRowHeader(sheet, 1, 0, header1, properties);
//                setValueRowHeader(sheet, 3, 0, header3, properties);
//                setValueRowHeader(sheet, 4, 0, header4, properties);
//                setValueRowHeader(sheet, 5, 0, header5, properties);
//                setValueRowHeader(sheet, 6, 0, header6, properties);
//                setValueRowHeader(sheet, 7, 0, header7, properties);

        // create style for header cells
        CellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setFontName("Arial");
        style.setFillForegroundColor(HSSFColor.GREEN.index);
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setColor(HSSFColor.WHITE.index);
        style.setFont(font);
        // create header row
        HSSFRow header = sheet.createRow(4);

        
        header.createCell(0).setCellValue("ID DATA");
        header.getCell(0).setCellStyle(style);
        header.createCell(1).setCellValue("NAMA");
        header.getCell(1).setCellStyle(style);
        header.createCell(2).setCellValue("TEMPAT LAHIR");
        header.getCell(2).setCellStyle(style);
        header.createCell(3).setCellValue("TANGGAL LAHIR");
        header.getCell(3).setCellStyle(style);
        header.createCell(4).setCellValue("PROFESI");
        header.getCell(4).setCellStyle(style);
        header.createCell(5).setCellValue("ALAMAT");
        header.getCell(5).setCellStyle(style);
        header.createCell(6).setCellValue("NO TELP");
        header.getCell(6).setCellStyle(style);
        header.createCell(7).setCellValue("EMAIL");
        header.getCell(7).setCellStyle(style);
        // create data rows
        int rowCount = 5;

        for (DataDto jur : listDtoData) {
            HSSFRow aRow = sheet.createRow(rowCount++);
            aRow.createCell(0).setCellValue(jur.getId());
            aRow.createCell(1).setCellValue(jur.getNama());
            aRow.createCell(2).setCellValue(jur.getTempat_lahir());
            aRow.createCell(3).setCellValue(jur.getTanggal_lahir());
            aRow.createCell(4).setCellValue(jur.getProfesi());
            aRow.createCell(5).setCellValue(jur.getAlamat());
            aRow.createCell(6).setCellValue(jur.getNope());
            aRow.createCell(7).setCellValue(jur.getEmail());
        }
    }

    public void setValueRowHeader(HSSFSheet sheet, int row, int column, String items[], Map<String, Object> properties) {
        Row rowHeader = sheet.createRow(row);
        rowHeader.setHeight((short) +400);
        Cell cellHeader;
        int cellIndx = column;
        for (String value : items) {
            cellHeader = rowHeader.createCell(cellIndx++);
            cellHeader.setCellValue(value);
            //CellUtil.setCellStyleProperties(cellHeader, properties);
        }
    }

    public Map<String, Object> setStylePropertiesCenter() {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put(CellUtil.FONT, FontFormatting.U_DOUBLE);
        properties.put(CellUtil.ALIGNMENT, HorizontalAlignment.CENTER);
        properties.put(CellUtil.VERTICAL_ALIGNMENT, VerticalAlignment.CENTER);
        return properties;
    }

    public Map<String, Object> setStylePropertiesLeft() {
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put(CellUtil.FONT, FontFormatting.U_DOUBLE);
        properties.put(CellUtil.ALIGNMENT, HorizontalAlignment.LEFT);
        properties.put(CellUtil.VERTICAL_ALIGNMENT, VerticalAlignment.CENTER);
        return properties;
    }
    
}
