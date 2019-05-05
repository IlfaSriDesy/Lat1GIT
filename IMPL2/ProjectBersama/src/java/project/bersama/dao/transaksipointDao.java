/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao;

import java.util.List;
import project.bersama.model.transaksipoint_tbl;

/**
 *
 * @author acer v5
 */
public interface transaksipointDao {
    public List<transaksipoint_tbl> getListDataTransaksi() throws Exception;
}
