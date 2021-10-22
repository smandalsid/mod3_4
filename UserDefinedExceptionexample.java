class UserDefinedException extends Exception{ // step 1 to inherit
    UserDefinedException(String str)
    {
        super(str);
    }
}

class UserDefinedExceptionexample {
    static void checkage(int a) throws UserDefinedException
    {
        if (a<0)
        {
            throw new UserDefinedException("Age cannot be negative");
        }
        else
        {
            System.out.println("Age: "+a);
        }
    }
    public static void main(String[] args)
    {
        try
        {
            checkage(10);
            checkage(-10);
        }
        catch(UserDefinedException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}