/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecta;

/**
 *
 * @author abcxy
 */
public class DoUong extends MatHang {
    private boolean trinhdien;
    public DoUong(boolean trinhdien, String Mathang, String Mahang, int Soluong, double Giavon) {
        super(Mathang, Mahang, Soluong, Giavon);
        this.trinhdien = trinhdien;
    }
    public boolean isTrinhdien() {
        return trinhdien;
    }
    public void setTrinhdien(boolean trinhdien) {
        this.trinhdien = trinhdien;
    }
    @Override
    public double MenhGia(){
        if(trinhdien){
            return (Giavon/TY_LE_GIA_VON) +200000;
        } 
        else 
            return Giavon/TY_LE_GIA_VON;
    }
    @Override
    public String hienthongtin(){
        String info= super.hienthongtin();
        info += "Yeu cau dau bep trinh dien: " + (trinhdien ? "YES" : "NO");
        info += "Gia mon an sau trinh dien la: " + MenhGia() + "\n";
        info += "=====END=====";
        System.out.println(info);
        return info;
    }
}
