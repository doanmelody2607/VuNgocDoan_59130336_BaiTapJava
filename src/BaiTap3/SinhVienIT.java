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
public class SinhVienIT extends SinhVienPoly{
    double diemJava;
    double diemCss;
    double diemHtml;
    
    public SinhVienIT(){
        
    }
    
    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml){
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }
    
    //Ham get & set
    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }
    
    //Phuong thuc getDiem()
    @Override
    public double getDiem() {
        return (2*diemJava + diemHtml + diemCss)/4; 
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
