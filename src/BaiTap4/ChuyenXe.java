/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author Vu Ngoc Doan
 */
public abstract class ChuyenXe 
{
    String maSoChuyen;
    String hoTenTaiXe;
    int soXe;
    double doanhThu;
    
    public ChuyenXe(){
        
    }
    
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, int soXe ,double doanhThu){
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe  = hoTenTaiXe;
        this.doanhThu = doanhThu;
    }
    
    //Ham get & set

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }
    
    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public String getThongTin(){
       return "Mã số chuyến: " + maSoChuyen + "\n"
               +"Họ tên tài xế: " + hoTenTaiXe + "\n"
               +"Số xe: " + soXe;
    }
}
