/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecta;

/**
 *
 * @author abcxy
 */
public class MonAn extends MatHang {
    private boolean NongLanh;

    public MonAn(boolean NongLanh, String Mathang, String Mahang, int Soluong, double Giavon) {
        super(Mathang, Mahang, Soluong, Giavon);
        this.NongLanh = NongLanh;
    }
    public boolean isNongLanh() {
        return NongLanh;
    }
    public void setNongLanh(boolean NongLanh) {
        this.NongLanh = NongLanh;
    }
    @Override
    public double MenhGia(){
    return Giavon/TY_LE_GIA_VON;
}
    @Override
    public String hienthongtin(){
        String info= super.hienthongtin();
         info += "Do uong nong hay lanh: " + (NongLanh ? "YES" : "NO");
        info += "Gia do an la: " + MenhGia() + "\n";
        info += "=====END=====";
        System.out.println(info);
        return info;
    }
    
    
}
