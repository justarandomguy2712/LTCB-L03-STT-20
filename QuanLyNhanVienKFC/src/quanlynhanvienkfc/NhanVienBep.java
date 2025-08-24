/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvienkfc;

/**
 *
 * @author AGuyJustWantToCode
 */
public class NhanVienBep extends NhanVien {
    private boolean isBepTruong;
    private double ThuongChucVu;
    public NhanVienBep(boolean isBepTruong, String HoTen, int ThamNien, String QưeQuan, int SoGio,double ThuongChucVu) {
        super(HoTen, ThamNien, QưeQuan, SoGio);
        this.isBepTruong = isBepTruong;
        this.ThuongChucVu = ThuongChucVu;
    }
    public boolean isIsBepTruong() {
        return isBepTruong;
    }
    public void setIsBepTruong(boolean isBepTruong) {
        this.isBepTruong = isBepTruong;
    }

    public double getThuongChucVu() {
        return ThuongChucVu;
    }
    public void setThuongChucVu(double ThuongChucVu) {
        this.ThuongChucVu = ThuongChucVu;
    }
    @Override
    public double tinhLuong (){
        if(isBepTruong){
            return SoGio*LUONG_GIO + ThuongChucVu;
        } else {
            return SoGio*LUONG_GIO;
        }
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Bep Truong: " +(isBepTruong ? "Có" : "Không"));
        System.out.println("Thuong chuc vu: " + ThuongChucVu);
    }
}
