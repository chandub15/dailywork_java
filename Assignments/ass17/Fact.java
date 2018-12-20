

public class Fact {

    public static void main(String[] args) {

        Fact f = new Fact();

        System.out.println("Int factorials:");
        f.intFact();

        System.out.println("Long factorials:");
        f.longFactorials();


    }
     private void intFact(){

        int i  = 1;
        int fac = 1;
        while (true)
        {
            System.out.println("The factorial of "+i+ " is "+ fac);
            if (Integer.MAX_VALUE / fac < (i+1)) {
                System.out.println("The factorial of "+(i+1)+" is out of range ");
                break;
            }
            i++;
            fac *= i;
        }

    }


    private void longFactorials()
    {
        long i  = 1L;
        long fac = 1L;
        while (true)
        {
            System.out.println("The factorial of "+i+ " is "+ fac);
            if (Long.MAX_VALUE / fac < (i+1)) {
                System.out.println("The factorial of "+(i+1)+" is out of range ");
                break;
            }
            i++;
            fac *= i;
        }

    }
}
