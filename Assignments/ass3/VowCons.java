import java.util.Scanner;

public class VowCons {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        char c;
        int a;

        int len= s.length();

        for(int i=0;i<len;i++) {
            c = s.charAt(i);
            a = c;
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    System.out.println(c + " is a vowel");
                }
                else {
                    System.out.println(c + " is a consonant");
                }
            }
            else {
                    System.out.println("error : "+c+ " is not a letter");

                }
        }


    }
}
