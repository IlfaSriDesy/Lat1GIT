/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.dao;

import java.util.List;
import project.bersama.model.MemberModel;

/**
 *
 * @author HP
 */
public interface MemberDao {
    public List<MemberModel> getAllMember()throws Exception;
}
