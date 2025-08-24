
package Product;
import java.util.ArrayList;
import java.util.Scanner;
public class list {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> iu = new ArrayList<> ();
        System.out.println("Nhap phan tu cua mang: ");
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
             System.out.println("Nhap phan tu thu " + (i+1) + ":" );
             int value= scanner.nextInt();
             iu.add(value);
    }
        for (int i=0;i<n;i++){
        System.out.println("Gia tri cua cac phan tu la " + iu);
    }
     }
}
