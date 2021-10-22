import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args){
        int a,b;
        int ar[]={1,2,3};
        String str=null;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            try
            {
                try // here all the try blocks will work and nothing will get skipped after getting exception
                {
                    System.out.println(str.length());
                }
                catch(NullPointerException e)
                {
                    System.out.println("string is null");
                }
                System.out.println(ar[4]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array index out of bound");
            }
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("b is 0");
        }
    }
}
