/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bersama.model;

/**
 *
 * @author acer v5
 */
public class transaksipoint_tbl {
    String trans_id;
    String date;
    String member_id;
    String jnspoint_id;
    String desc;

    public String getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getJnspoint_id() {
        return jnspoint_id;
    }

    public void setJnspoint_id(String jnspoint_id) {
        this.jnspoint_id = jnspoint_id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
}
