
package Product;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Regex {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Run video 212");
        Pattern pattern= Pattern.compile("^[a-zA-Z0-9]d{6,}$");
        System.out.println("Nhap CCCD");
        String password= scanner.nextLine();
        Matcher matcher = pattern.matcher(password);
        System.out.println("Input String matches regex - " + matcher.matches());
 }
}
