/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service;

import java.util.List;
import project.bersama.dto.foodCategoryDto;

/**
 *
 * @author LK
 */
public interface foodCategoryService {
    public List <foodCategoryDto> getListFoodCategory()throws Exception;
}
