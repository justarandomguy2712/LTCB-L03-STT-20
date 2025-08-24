/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvienkfc;
public class NhanVien {
    protected String HoTen;
    protected int ThamNien;
    protected String QưeQuan;
    protected int SoGio;
    protected final int LUONG_GIO=100000;
    public NhanVien(String HoTen, int ThamNien, String QưeQuan, int SoGio) {
        this.HoTen = HoTen;
        this.ThamNien = ThamNien;
        this.QưeQuan = QưeQuan;
        this.SoGio = SoGio;
    }
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getThamNien() {
        return ThamNien;
    }

    public void setThamNien(int ThamNien) {
        this.ThamNien = ThamNien;
    }

    public String getQưeQuan() {
        return QưeQuan;
    }

    public void setQưeQuan(String QưeQuan) {
        this.QưeQuan = QưeQuan;
    }

    public int getSoGio() {
        return SoGio;
    }

    public void setSoGio(int SoGio) {
        this.SoGio = SoGio;
    }
    public double tinhLuong(){
        return SoGio*LUONG_GIO;
    }
    public void inThongTin(){
        System.out.println("Ho va Ten: " + HoTen);
        System.out.println("Tham Nien: " + ThamNien);
        System.out.println("Que Quan: " + QưeQuan);
        System.out.println("So Gio Lam Viec: " + SoGio);
        System.out.println("Luong Thuc Linh: " + tinhLuong());
    }
    
    
}
