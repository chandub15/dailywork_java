import java.util.Scanner;

public class SortSum{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int sum=0,s,c=0,temp,num;
        int i=0,j,n,len=0;
        num=sc.nextInt();

        int[] arr=new int[10];

        while (num != 0) {

            s = num % 10;
            arr[len]=s;
            if (s % 2 == 0) {
                sum = sum + s;
            }
            num = num / 10;
            len++;
        }

        n=len;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(i=0;i<n;i++){
            System.out.print(""+arr[i]);
        }

        System.out.println("\n"+sum);

        if(sum>15){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}