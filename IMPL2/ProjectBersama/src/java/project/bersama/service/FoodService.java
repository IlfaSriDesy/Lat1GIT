/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service;

import java.util.List;
import project.bersama.dto.FoodDto;

/**
 *
 * @author Acer
 */
public interface FoodService {

    public List<FoodDto> getListDataFood() throws Exception;
    
}
