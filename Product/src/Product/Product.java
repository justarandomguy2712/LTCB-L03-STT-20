package Product;
import java.util.Scanner;
public class Product {
    private String name;
    private double price;
    private double tax;
    public Product (String name, double price, double tax,double c){
        this.name=name;
        this.price=price;
        this.tax=tax;
    }
    public Product (){
    }
    public void nhapthongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        name=scanner.nextLine();
        System.out.println("Nhap gia cua san pham: ");
        price=scanner.nextDouble();
        System.out.println("Nhap thue: ");
        tax=scanner.nextDouble();
    }
    public double getTaxPrice(){
        return price*tax;
    }
    public void  xuatthongtin (){
        Hello k = new Hello();
        k.setName(name);
        k.setPrice(price);
        k.setTax(tax);
        System.out.println("Ten san pham la : " + k.getName());
        System.out.println("Gia tien san pham la: " + k.getPrice());
        System.out.println("Thue VAT la: " + k.getTax());
        System.out.println("So tien thue la: " + k.getTaxPrice());
    }
   public static void main(String[] args) {
    Product p = new Product();   
    p.nhapthongtin();            
    p.xuatthongtin();
    }
}
