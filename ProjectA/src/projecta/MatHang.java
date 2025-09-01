
package projecta;

public class MatHang {
    protected String Mathang;
    protected String Mahang;
    protected int Soluong;
    protected double Giavon;
    protected final static double TY_LE_GIA_VON=0.4;

    public MatHang(String Mathang, String Mahang, int Soluong, double Giavon) {
        this.Mathang = Mathang;
        this.Mahang = Mahang;
        this.Soluong = Soluong;
        this.Giavon = Giavon;
    }
    public String getMathang() {
        return Mathang;
    }

    public void setMathang(String Mathang) {
        this.Mathang = Mathang;
    }

    public String getMahang() {
        return Mahang;
    }

    public void setMahang(String Mahang) {
        this.Mahang = Mahang;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public double getGiavon() {
        return Giavon;
    }

    public void setGiavon(double Giavon) {
        this.Giavon = Giavon;
    }
    public double MenhGia(){
    return Giavon/TY_LE_GIA_VON;
}
    public String hienthongtin(){
        return "Mat Hang la: " + Mathang + "\n" +
           "Ma Hang la: " + Mahang + "\n" +
           "So Luong la: " + Soluong + "$"+ "\n";
    }
}
