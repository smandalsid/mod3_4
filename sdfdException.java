// import java.lang.Throwable;
import java.util.Scanner;
public class sdfdException {
    public static void main(String[] args) {
        int a,b;
        String str=null;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int ar[]={1,2,3,4};
        System.out.println("Addition of the number\n"+(a+b));
        System.out.println("Subtraction of the number\n"+(a-b));
        try
        {
            System.out.println("Modulus of the number\n"+(a%b));
        }
        catch(ArithmeticException e) // we can also use only Exception e instead of Arithmetic or NullPointerException
        {
            System.out.println("b cannot be zero");
        }
        System.out.println("Multiplication of the number\n"+(a*b));

        try 
        {
            System.out.println("String length: "+str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("NULL pointer exception");
        }

        try
        {
            System.out.println(ar[4]);
        }
        catch (ArrayIndexOutOfBoundsException t)
        {
            System.out.println("Some exception occured");
        }

    }
}

// ClassNotFoundException
// FileNotFoundException
// ArrayIndexOutOfBoundsException
// IOException
// NullPointerException
// ArithmeticException
// NumberFormatException
// StringIndexOutOfBoundsException
