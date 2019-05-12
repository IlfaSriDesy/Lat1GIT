/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao;

import java.util.List;
import project.bersama.model.LayerDelapan;


/**
 *
 * @author ASUS
 */
public interface LayerDelapanDao {
    public List<LayerDelapan> getListDataDua() throws Exception;
    public List<LayerDelapan> getDataById(String kdproduk) throws Exception;
    public LayerDelapan getDataModelById(String id);
    public void updateDua(LayerDelapan datamodel);
    public void saveDataDua(LayerDelapan datamodel);
}
