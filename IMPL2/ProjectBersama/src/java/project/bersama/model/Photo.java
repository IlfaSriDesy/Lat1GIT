/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.model;

/**
 *
 * @author Nina M Aida
 */
public class Photo {
    String photo_nm;
    int photo_id=1;

    public Integer getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(Integer photo_id) {
        this.photo_id = photo_id;
    }

    public String getPhoto_nm() {
        return photo_nm;
    }

    public void setPhoto_nm(String photo_nm) {
        this.photo_nm = photo_nm;
    }
    
}
