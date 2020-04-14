/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Vu Ngoc Doan
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Khoi tao SinhVienPoly
        SinhVienPoly sv1 = new SinhVienIT("Vũ Ngọc Đoàn", "Công nghệ thông tin", 8, 9, 10);
        System.out.println(sv1.Xuat());
        
        //Khoi tao SinhVienIT
        SinhVienIT sv2 = new SinhVienIT("Nguyễn Hoàng Minh", "Thông tin quản lý", 5, 5, 6);
        System.out.println(sv2.Xuat());
        
        //Khoi tao SinhVienBiz
        SinhVienBiz sv3 = new SinhVienBiz("Nguyễn Túy Dũng", "Quản trị du lịch", 2, 4);
        System.out.println(sv3.Xuat());
    }
    
}
