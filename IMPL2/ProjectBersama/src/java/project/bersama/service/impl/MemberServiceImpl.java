/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import project.bersama.dao.MemberDao;
import project.bersama.dto.MemberDto;
import project.bersama.model.MemberModel;
import project.bersama.service.MemberService;

/**
 *
 * @author HP
 */
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberDao memberDao;
            
    @Override
    public List<MemberDto> getData() throws Exception {
        List<MemberDto> listData=new ArrayList<>();
        List<MemberModel> data=memberDao.getAllMember();
        System.out.println("xxxxxx");
        System.out.println(data);
        try {
            MemberDto dto=null;
            for(MemberModel model:data){
                dto=new MemberDto();
                if(model.getMember_id()!=null){
                    dto.setMember_id(model.getMember_id());
                }
                dto.setMember_nm(model.getMember_nm());
                dto.setMember_jk(model.getMember_jk());
                dto.setMember_point(model.getMember_point());
                listData.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listData;
    }
    
}
