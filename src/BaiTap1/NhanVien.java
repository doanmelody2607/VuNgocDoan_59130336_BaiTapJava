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
public class NhanVien {
    String ten;
    int tuoi;
    String diachi;
    double luong;
    int tonggio;
    
    //Constructor khong tham so 
    public NhanVien(){
    }
    
    //Constructor day du tham so
    public NhanVien(String ten, int tuoi, String diachi, double luong, int tonggio){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.tonggio = tonggio;
    }
    
    //Ham get/set

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getTonggio() {
        return tonggio;
    }

    public void setTonggio(int tonggio) {
        this.tonggio = tonggio;
    }
    
    //Cac phuong thuc 
    
    public double tinhThuong(){
        double thuong = 0;
        if(tonggio >= 200) thuong = luong*0.2;
        if(tonggio < 200 && tonggio > 100) thuong = luong*0.1;
        if(tonggio < 100) thuong = luong*0;
        return thuong;
    }
    
    public String getThongTin(){
        return "Tên: " + ten + "\n"
                + "Tuổi: " + tuoi + "\n"
                + "Địa chỉ: " + diachi + "\n"
                + "Tiền lương: " + luong + "\n"
                + "Tổng số giờ làm: " + tonggio + "\n"
                + "Tiền thưởng: " + tinhThuong();
    }
    
}
