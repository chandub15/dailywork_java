
import java.util.Scanner;

public class StringRep {

    public static void main(String[] args) {
	// write your code here

        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        int n=sc.nextInt();
        int len=s.length();
        char[] ch=s.toCharArray();
        System.out.print(s);
        int ite=n;
        while(ite!=0) {
            for (int i = (len - n); i < len; i++) {
                System.out.print(ch[i]);
            }
            ite--;
        }
    }
}
