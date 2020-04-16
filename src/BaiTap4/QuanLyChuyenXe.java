/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;
import java.util.ArrayList;
/**
 *
 * @author Vu Ngoc Doan
 */
public class QuanLyChuyenXe {
    
    public QuanLyChuyenXe(){
        
    }
    
    ArrayList<ChuyenXe> list = new ArrayList<>();
    
    public void themChuyenXe(ChuyenXe cx){
        list.add(cx);
    }
    
    public void danhSachChuyenXe(){
        for(ChuyenXe n : list){
            System.out.println(n.getThongTin());
        }
    }
    
    
  
}
