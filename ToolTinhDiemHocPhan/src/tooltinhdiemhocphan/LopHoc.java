/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tooltinhdiemhocphan;
import java.util.ArrayList;

public class LopHoc {
    private ArrayList<SinhVien> danhsachSinhVien;
    private int SiSo;
    private String tenlop;

    public LopHoc(ArrayList<SinhVien> danhsachSinhVien, int SiSo, String tenlop) {
        this.danhsachSinhVien = danhsachSinhVien;
        this.SiSo = SiSo;
        this.tenlop = tenlop;
    }

    public LopHoc(String tenlop) {
        this.danhsachSinhVien = new ArrayList<>();
        this.SiSo = 0;
        this.tenlop = tenlop;
    }

    public ArrayList<SinhVien> getDanhsachSinhVien() {
        return danhsachSinhVien;
    }

    public void setDanhsachSinhVien(ArrayList<SinhVien> danhsachSinhVien) {
        this.danhsachSinhVien = danhsachSinhVien;
    }

    public int getSiSo() {
        return SiSo;
    }

    public void setSiSo(int SiSo) {
        this.SiSo = SiSo;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    
    public String getTenLop() {
        return this.tenlop;
    }
}

