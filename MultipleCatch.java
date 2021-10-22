import java.util.Scanner;
public class MultipleCatch {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        String str=null;
        try
        {
            System.out.println(str.length());
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("b is 0");
        }
        catch(NullPointerException e)
        {
            System.out.println("String is null");
        }
    }
}
