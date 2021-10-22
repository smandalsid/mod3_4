public class Sleep extends Thread {
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.getMessage();
            }
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        Sleep obj = new Sleep();
        Sleep obj1 = new Sleep();
        obj.start();
        obj1.start();
    }
}
