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
public abstract class SinhVienPoly {
    String hoTen;
    String nganh;
    
    public SinhVienPoly(){
        
    }
    
    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    
    //Ham get & set

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    //Phuong thuc getDiem()
    public double getDiem(){
        return 0;
    }
    
    //Phuong thuc getHocLuc()
    public String getHocLuc(){
        String xepLoai = "";
        if(getDiem() < 5) xepLoai = "Yếu";
        if(getDiem() >= 5 && getDiem() < 6.5) xepLoai = "Trung bình";
        if(getDiem() >= 6.5 && getDiem() < 7.5) xepLoai = "Khá";
        if(getDiem() >= 7.5 && getDiem() < 9) xepLoai = "Giỏi";
        if(getDiem() >= 9) xepLoai = "Xuất sắc";
        return xepLoai;
    }
    
    //Phuong thuc Xuat()
    public String Xuat(){
        return "Họ tên: " + hoTen + "\n"
                + "Ngành: " + nganh;
    }
}

