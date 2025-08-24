/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvienkfc;

/**
 *
 * @author AGuyJustWantToCode
 */
public class NhanVienThuNgan extends NhanVien {
    private boolean isBietNgoaiNgu;

    public NhanVienThuNgan(boolean isBietNgoaiNgu, String HoTen, int ThamNien, String QưeQuan, int SoGio) {
        super(HoTen, ThamNien, QưeQuan, SoGio);
        this.isBietNgoaiNgu = isBietNgoaiNgu;
    }
    @Override
    public double tinhLuong (){
            return SoGio*LUONG_GIO;
        }
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Nhan Vien Biet Ngoai Ngu"+ (isBietNgoaiNgu ? "Có" :"Không" ));
    }
}
