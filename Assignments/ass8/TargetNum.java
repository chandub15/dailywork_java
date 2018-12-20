
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

           Scanner sc=new Scanner(System.in);

            int num=0;
            int target=50;
            while(true){
                num=sc.nextInt();
                if(num>0 && num <=100){

                    if(num>target) {
                        System.out.println("Number guessed is more than original number");
                    }
                    else if(num<target) {
                        System.out.println("Number guessed is less than original number");
                    }
                    else if(num==target){
                        System.out.println("Number guessed matches the original number");
                        break;
                    }

                }
            }


    }
}
