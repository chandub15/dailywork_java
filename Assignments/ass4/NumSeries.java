import java.util.Scanner;

public class NumSeries {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        int i, j;
        n=sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("" + i + "");
            }
        }
    }
}
