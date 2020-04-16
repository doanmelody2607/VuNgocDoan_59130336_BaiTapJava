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
public class XeNoiThanh extends ChuyenXe{
    int soTuyen;
    int soKm;
    
    public XeNoiThanh(){
        
    }
    
    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, int soTuyen, int soKm, double doanhThu){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;  
    }
    
    //Ham get & set

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    @Override
    public String getThongTin() {
        return super.getThongTin() + "\n"
                +"Số tuyến: " + soTuyen + "\n"
                +"Số km: " + soKm; 
            //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
