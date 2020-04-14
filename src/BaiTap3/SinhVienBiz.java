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
public class SinhVienBiz extends SinhVienPoly{
    double diemMarketing;
    double diemSales;
    
    public SinhVienBiz(){
        
    }
    
    public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales){
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    
    //Ham get & set

    public double getDiemMarketing() {
        return diemMarketing;
    }

    public void setDiemMarketing(double diemMarketing) {
        this.diemMarketing = diemMarketing;
    }

    public double getDiemSales() {
        return diemSales;
    }

    public void setDiemSales(double diemSales) {
        this.diemSales = diemSales;
    }
    
    //Phuong thuc getDiem()
    @Override
    public double getDiem() {
        return (2*diemMarketing + diemSales)/3; 
            //To change body of generated methods, choose Tools | Templates.
    }
    
    //Phuong thuc getHocLuc()
    @Override
    public String getHocLuc() {
        return super.getHocLuc(); 
            //To change body of generated methods, choose Tools | Templates.
    }
    
    //Phuong thuc Xuat()
    @Override
    public String Xuat() {
        return super.Xuat() + "\n"
                + "Điểm trung bình: " + getDiem() + "\n"
                + "Học lực: " + getHocLuc() + "\n";
            //To change body of generated methods, choose Tools | Templates.
    }
    
}
