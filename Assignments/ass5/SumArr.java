import java.util.InputMismatchException;
import java.util.Scanner;

public class SumArr {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n,sum=0,c=1;
        int [] arr=new int[100];

        n=sc.nextInt();

        for(int i=0;i<n;i++){
            try {
                arr[i] = sc.nextInt();
            }
            catch(InputMismatchException e){
                c=0;
                break;
            }
        }

        for(int i=0;i<n;i++){

            sum=sum+arr[i];
        }

        if(c==1){
            System.out.print(sum);
        }
        else{
            System.out.println("Error");
        }
    }
}
