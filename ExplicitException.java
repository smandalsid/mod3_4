import java.util.Scanner;

// throw is used here

public class ExplicitException {
    static void checkage(int n)
    {
        if (n<=0)
        {
            throw new ArithmeticException("Age cannot be less than 0"); // explicitely throw the exception to gibve more detailed explanation about the exception
        }
        else
        {
            System.out.println("Age is: "+n);
        }
    }
    public static void main(String[] args)
    {
        try
        {
            checkage(10);
            checkage(0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}

// 1. extend the exception class to used defined exception class
// 2. call the constructor of exception class through the user defined exception class constructor
// 3. explicitely trigger or throw the exception -> throw
// 4. throws user defined exception 