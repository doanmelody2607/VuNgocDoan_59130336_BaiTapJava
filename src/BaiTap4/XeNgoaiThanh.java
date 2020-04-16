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
public class XeNgoaiThanh extends ChuyenXe{
    String noiDen;
    int soNgay;
    
    public XeNgoaiThanh(){
        
    }
    
    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, String noiDen, int soNgay, double doanhThu){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }
    
    //Ham get & set

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public String getThongTin() {
        return super.getThongTin() + "\n"
                +"Nơi đến: " + noiDen + "\n"
                +"Số ngày đi được: " + soNgay;
            //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
