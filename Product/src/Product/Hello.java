
package Product;
public class Hello {
    private String name;
    private double price;
    private double tax;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getTax(){
        return tax;
    }
    public void setTax(double tax){
        this.tax=tax;
    }
     public double getTaxPrice(){
          return price*tax;
      }
}
