


public class DienThoai extends HangHoa {
    private String NhaSanXuat;
    private int DungLuong;
    private String MauSac;

    public DienThoai(String NhaSanXuat, int DungLuong, String MauSac, String MaHang, String Ten, int GiaBan) {
        super(MaHang, Ten, GiaBan);
        this.NhaSanXuat = NhaSanXuat;
        this.DungLuong = DungLuong;
        this.MauSac = MauSac;
    }
    public DienThoai(){
        
    }
    public String getNhaSanXuat() {
        return NhaSanXuat;
    }
    public void setNhaSanXuat(String NhaSanXuat) {
        this.NhaSanXuat = NhaSanXuat;
    }
    public int getDungLuong() {
        return DungLuong;
    }
    public void setDungLuong(int DungLuong) {
        this.DungLuong = DungLuong;
    }

    public String getMauSac() {
        return MauSac;
    }
    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }
   public String display() {
    String info = super.layThongTin(); 
    info += "Nha San Xuat la: " + NhaSanXuat + "\n";
    info += "Dung Luong la: " + DungLuong + "GB\n";
    info += "Mau Sac la: " + MauSac + "\n";
    info += "=======END=======\n";

    System.out.print(info); 
    return info; 
}
}
