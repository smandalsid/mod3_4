import java.util.Scanner;

public class Finally { // finally is used to write some standard code that we want to get executed irrespective of exception
    // like closing a file at the end of the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("All excpetions handled");
        }
    }
}
