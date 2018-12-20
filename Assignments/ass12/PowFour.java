import java.util.Scanner;
public class PowFour {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if((int)(Math.ceil((Math.log(n) / Math.log(4)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(4)))))){
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}
