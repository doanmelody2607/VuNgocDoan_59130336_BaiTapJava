/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;


/**
 *
 * @author Vu Ngoc Doan
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVien nv1 = new NhanVien("Vu Ngoc Doan", 20, "Nha Trang", 500, 200);
        System.out.println(nv1.getThongTin());

        System.out.println("----------------------------");
        
        NhanVien nv2 = new NhanVien("Nguyen Hoang Minh", 21, "Phu Yen", 300, 150);
        System.out.println(nv2.getThongTin());
        
    }
    
}
