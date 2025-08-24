


public class HangHoa {
    protected String MaHang;
    protected String Ten;
    protected int GiaBan;
    public HangHoa(String MaHang, String Ten, int GiaBan) {
        this.MaHang = MaHang;
        this.Ten = Ten;
        this.GiaBan = GiaBan;
    }
    public HangHoa(){
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }
    
    public String layThongTin() {
    return "Ma Hang la: " + MaHang + "\n" +
           "Ten Hang la: " + Ten + "\n" +
           "Gia Ban la: " + GiaBan + "$"+ "\n";
  }
}


