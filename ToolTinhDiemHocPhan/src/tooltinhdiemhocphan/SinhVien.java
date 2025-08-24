
package tooltinhdiemhocphan;

public class SinhVien {
    private String name;
    private String ID;
    private double diemcuoiki;
    private double diemquatrinh;
    private LopHoc tenlop;
    

    public SinhVien(String ID, String name, double diemquatrinh, double diemcuoiki,LopHoc tenlop) {
        this.name = name;
        this.ID = ID;
        this.diemcuoiki = diemcuoiki;
        this.diemquatrinh = diemquatrinh;
        this.tenlop=tenlop;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getDiemcuoiki() {
        return diemcuoiki;
    }

    public void setDiemcuoiki(float diemcuoiki) {
        this.diemcuoiki = diemcuoiki;
    }

    public double getDiemquatrinh() {
        return diemquatrinh;
    }
    public void setDiemquatrinh(float diemquatrinh) {
        this.diemquatrinh = diemquatrinh;
    }
    public LopHoc getlop() {
        return tenlop;
    }
    public String getTenlop() {
        return tenlop.getTenLop();
    }
    
    public double Diemtrungbinh(){
      return diemquatrinh*0.3 + diemcuoiki*0.7;
    }
   public String Diemchu(){
    double dtb = Diemtrungbinh();
    if (dtb >= 9.0) return "A+";
    else if (dtb >= 8.5) return "A";
    else if (dtb >= 7.8) return "B+";
    else if (dtb >= 7.0) return "B";
    else if (dtb >= 6.3) return "C+";
    else if (dtb >= 5.5) return "C";
    else if (dtb >= 4.8) return "D+";
    else if (dtb >= 4.0) return "D";
    else return "F";
}

    public void hienthithongtin(){
        System.out.println("Ho va ten sinh vien: "+ name);
        System.out.println("Diem qua trinh: "+ diemquatrinh);
        System.out.println("Diem cuoi ki: " + diemcuoiki);
        System.out.println("Diem trung binh: "+Diemtrungbinh());
    }
    
}
