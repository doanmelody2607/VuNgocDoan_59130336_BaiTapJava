/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author Vu Ngoc Doan
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Khoi tao 1 doi tuong QLNV 
        QuanLyNhanVien ql = new QuanLyNhanVien();
        
        //Them vao nhan vien moi      
        NhanVien nv1 = new NhanVien("Diep Chau Hoang", 20, "Phu Yen", 2000, 200);
        ql.them(nv1);
        
        NhanVien nv2 = new NhanVien("Tieu Nghia Phong", 28, "Ca Mau", 1200, 80);
        ql.them(nv2);
        
        NhanVien nv3 = new NhanVien("Hoang Minh Hieu", 25, "Cam Ranh", 1000, 100);
        ql.them(nv3);
         
        NhanVien nv4 = new NhanVien("Huynh Nhat Ha", 18, "Thai Binh", 1500, 150);
        ql.them(nv4);
        
        NhanVien nv5 = new NhanVien("Cao Huu Nhat", 22, "Nha Trang", 1800, 180);
        ql.them(nv5);
        
        //In ra danh sach nhan vien
        System.err.println("DANH SACH CAC NHAN VIEN:");
        ql.inDS();
        
        
    }
    
}
