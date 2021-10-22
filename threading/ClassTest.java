import java.util.Scanner;

public class ClassTest extends Thread{
    int n;
    ClassTest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.getName()+" - "+"enter n:");
        n=sc.nextInt();
    }
    public void run()
    {
        if ((Thread.currentThread().getName()).equals("Thread-0"))
        {
            int i=2;
            int sum=0;
            while (i<=n)
            {
                sum+=i;
                i+=2;
            }
            System.out.println(this.getName()+": "+sum);
        }
        else if ((Thread.currentThread().getName()).equals("Thread-1"))
        {
            int i=1;
            int sum=0;
            while (i<=n)
            {
                sum+=i;
                i+=2;
            }
            System.out.println(this.getName()+": "+sum);
        }
        else if ((Thread.currentThread().getName()).equals("Thread-2"))
        {
            int i, sum=0;
            for (i=1;i<=n;i++)
            {
                sum+=i;
            }
            System.out.println(this.getName()+": "+sum);
        }
    }
    public static void main(String[] args) {
        ClassTest obj1 = new ClassTest();
        ClassTest obj2 = new ClassTest();
        ClassTest obj3 = new ClassTest();
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
