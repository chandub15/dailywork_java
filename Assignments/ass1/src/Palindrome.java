package ass1.src;

public class Palindrome {

    long sum,s,c=0,reverse=0;

    long numReverse(long num){

        int[] arr=new int[100];
        while (num != 0) {
            reverse = reverse * 10;
            s = num % 10;
            arr[i]=s;
            if (s % 2 == 0) {
                sum = sum + s;
            }
            reverse = reverse + s;
            num = num / 10;
            i++;
        }
        return 0;
    }
}
