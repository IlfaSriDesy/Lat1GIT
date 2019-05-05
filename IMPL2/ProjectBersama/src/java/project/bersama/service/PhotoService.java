/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service;

import java.util.List;
import project.bersama.dto.PhotoDto;

/**
 *
 * @author Nina M Aida
 */
public interface PhotoService {
    public void saveDataPhoto(PhotoDto photoDto) throws Exception;
    public List <PhotoDto> getListPhoto()throws Exception;
}
