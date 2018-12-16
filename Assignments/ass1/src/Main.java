import java.util.Scanner;

public class Main extends Palindrome{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long  num;
        num = sc.nextLong();
        Palindrome p = new Palindrome();
        p.numReverse(num);
        if(num==p.reverse){
            System.out.print(num+" is palindrome");
            if(p.sum>25){
                System.out.println(" and sum of numbers is greater than 25");
            }
            else{
                System.out.println(" and sum of numbers is less than 25");
            }
        }
        else {
            System.out.println(num+" is not a Palindrome");
        }

    }
}





