
class Print {
    synchronized void print(String str)
    {
        for (int i=0;i<10;i++)
        {   
            System.out.println("Printing "+i+": "+str);
            try
            {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                
            }
        }
    }
}

class Thread1 extends Thread {
    public void run()
    {
        Print obj = new Print();
        obj.print("Thread1");
    }
}

class Thread2 extends Thread {
    public void run()
    {
        Print obj = new Print();
        obj.print("Thread2");
    }
}

public class EdurekaPract {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.start();
        try
        {
            obj1.join();
        }
        catch(InterruptedException e)
        {

        }
        obj2.start();
    }
}