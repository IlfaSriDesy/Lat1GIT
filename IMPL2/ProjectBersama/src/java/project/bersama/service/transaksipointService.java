/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service;

import java.util.List;
import project.bersama.dto.transaksipointDto;

/**
 *
 * @author acer v5
 */
public interface transaksipointService {
    public List<transaksipointDto> getListDataTransaksi() throws Exception;
}
