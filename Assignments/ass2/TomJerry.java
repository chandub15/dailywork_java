
import java.util.Scanner;

public class TomJerry {

    public static void main(String[] args) {
        long num;
        Scanner sc=new Scanner(System.in);
        num=sc.nextLong();
        if (num >= 20 && num <= 30) {
            if (num % 2 == 0) {
                System.out.println("Tom");
            }
            else{
                System.out.println("Jerry");
            }
        }
        else{
            System.out.println("Enter number between 20-30");
        }
    }
}
