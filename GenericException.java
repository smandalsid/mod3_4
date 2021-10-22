import java.util.Scanner;

public class GenericException {
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            System.out.println(a/b);
        }
        catch (Throwable e) // dont use in exam unless mentioned
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace(); // adviced
            
        }
    }
}