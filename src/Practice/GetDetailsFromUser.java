package Practice;

import org.w3c.dom.ls.LSOutput;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class GetDetailsFromUser {
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
         System.out.println("Hello,"+name+"Your age is ,"+age+"years old");
    }
}
