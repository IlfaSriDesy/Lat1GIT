/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dto;

/**
 *
 * @author Acer
 */
public class FoodDto {
     String foodId, foodNm, foodSpec;
    
    public String getFoodId() {
        return foodId;
}

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodNm() {
        return foodNm;
    }

    public void setFoodNm(String foodNm) {
        this.foodNm = foodNm;
    }

    public String getFoodSpec() {
        return foodSpec;
    }

    public void setFoodSpec(String foodSpec) {
        this.foodSpec = foodSpec;
    }
     
}
