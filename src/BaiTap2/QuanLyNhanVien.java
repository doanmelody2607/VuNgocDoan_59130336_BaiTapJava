/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author Vu Ngoc Doan
 */
public class QuanLyNhanVien implements IQuanLy
{
    ArrayList<NhanVien> list = new ArrayList<>();
    
    public QuanLyNhanVien(){
        
    }
    
    @Override
    public void them(NhanVien nv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        list.add(nv);
    }

    @Override
    public void inDS() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(NhanVien i : list){
            System.out.println(i.getThongTin());
            System.out.println("-----------------------------");
        }
    }
    
}
