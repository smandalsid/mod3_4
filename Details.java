class InvalidLengthException extends Exception {
    InvalidLengthException(String str)
    {
        super(str);
    }
}

class MobileNumberWrongException extends Exception {
    MobileNumberWrongException(String str)
    {
        super(str);
    }
}

class RegNumberWrongException extends Exception {
    RegNumberWrongException(String str)
    {
        super(str);
    }
}
class exceptionhandling {
    static void register(String reg, String mob) throws InvalidLengthException
    {
        
        if (reg.length()!=9||mob.length()!=10)
        {
            throw new InvalidLengthException("The numbers are not of current length");
        }
        int flag=1;
        for (int i=0;i<mob.length();i++)
        {
            if (!Character.isDigit(mob.charAt(i)))
            {
                flag=0;
            }
        }
        // if (flag==0)
        // {
        //     throw new MobileNumberWrongException("Wrong mobile number");
        // }
        // flag=1;
        // for (int i=0;i<reg.length();i++)
        // {
        //     if (!Character.isDigit(reg.charAt(i)) || !Character.isLetter(reg.charAt(i)))
        //     {
        //         throw new RegNumberWrongException("The registration number has wrong characters");
        //     }
        // }

    }
}
public class Details {
    static void register(String reg, String mob) throws InvalidLengthException, MobileNumberWrongException, RegNumberWrongException
    {
        
        if (reg.length()!=9||mob.length()!=10)
        {
            throw new InvalidLengthException("The numbers are not of current length");
        }
        int flag=1;
        for (int i=0;i<mob.length();i++)
        {
            if (!Character.isDigit(mob.charAt(i)))
            {
                flag=0;
            }
        }
        if (flag==0)
        {
            throw new MobileNumberWrongException("Wrong mobile number");
        }
        flag=1;
        for (int i=0;i<reg.length();i++)
        {
            if (!Character.isDigit(reg.charAt(i)) && !Character.isLetter(reg.charAt(i)))
            {
                // throw new RegNumberWrongException("The registration number has wrong characters");
                flag=0;
            }
        }
        if (flag==0)
        {
            throw new  RegNumberWrongException("Registraion number is wrong");
        }

    }
    public static void main(String[] args) {
        String reg="20BD@0157";
        String mob="9903913107";
        try
        {
            register(reg,mob);
        }
        catch(InvalidLengthException e)
        {
            System.out.println(e.getMessage());
        }
        catch(MobileNumberWrongException e)
        {
            System.out.println(e.getMessage());
        }
        catch(RegNumberWrongException e)
        {
            e.getMessage();
        }
    }
}

