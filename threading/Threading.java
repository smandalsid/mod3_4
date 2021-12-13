
class Calculation {
    public synchronized void fiboncacci()
    {
        long num1=0;
        long num2=1;
        long num3;
        int count=2;
        System.out.println(0);
        System.out.println(1);
        while (count!=50)
        {
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
            count+=1;
            if (count==30)
            {
                try
                {
                    wait();
                }
                catch(InterruptedException e)
                {}
            }
        }
    }
    public synchronized void prime()
    {
        int count=0;
        int num=2;
        int i;
        int flag;
        while (count<25)
        {
            flag=1;
            for (i=2;i<num/2;i++)
            {
                if (num/i==0)
                {
                    flag=0;
                }
            }
            if (flag==1)
            {
                System.out.println(num);
                count+=1;
                num+=1;
            }
        }
        notify();
    }
}

public class Threading {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        Thread t1 = new Thread()
        {
            public void run()
            {
                c.fiboncacci();
            }
        };
        t1.setPriority(8);
        Thread t2 = new Thread()
        {
            public void run()
            {
                c.prime();
            }
        };
        t2.setPriority(5);
        t1.start();
        t2.start();
    }
}
