/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dto;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Nina M Aida
 */
public class PhotoDto {
    String photo_nm;
    int photo_id=1;
    MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

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
