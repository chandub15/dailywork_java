
import java.util.Scanner;
public class PalCheck {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	StringBuilder s=new StringBuilder(sc.next());
	System.out.println(s.reverse());
	if(s==(s.reverse())){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
    }
}
