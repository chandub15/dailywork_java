import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(java.lang.Character.isUpperCase(ch)){
            System.out.println("Capital");
        }
        else if(java.lang.Character.isLowerCase(ch)){
            System.out.println("LowerCase");
        }
        else if(java.lang.Character.isDigit(ch)){
            System.out.println("Digit");
        }
        else{
            System.out.println("Sppecial Symbol");
        }


    }
}
