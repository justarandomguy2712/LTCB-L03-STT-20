
package Product;

public class sex {
    String name;
    int age;
    public void display (){
        System.out.println("Hello World and my name is " + name + " and my age is " + age);
    }
    public static void main(String[] args){
        sex s= new sex();
        s.name= "Nguyen Manh Ha";
        s.age=29;
        s.display();
    }
}
