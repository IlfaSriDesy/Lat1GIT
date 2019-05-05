/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.serviceImpl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.bersama.dao.PhotoDao;
import project.bersama.dto.PhotoDto;
import project.bersama.model.Photo;
import project.bersama.service.PhotoService;

/**
 *
 * @author Nina M Aida
 */
@Service
@Transactional
public class PhotoServiceImpl implements PhotoService{
    
    @Autowired
    PhotoDao photoDao;
    @Override
    public void saveDataPhoto(PhotoDto photoDto) throws Exception {
        Photo photoModel = new Photo();
        try {
            photoModel.setPhoto_id(photoDto.getPhoto_id());
            photoModel.setPhoto_nm(photoDto.getFile().getOriginalFilename());
            photoDao.saveDataPhoto(photoModel);
                       
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<PhotoDto> getListPhoto() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
