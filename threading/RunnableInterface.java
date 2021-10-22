// even if we use runnable interface we still need to make our runnable class into thread object 

public class RunnableInterface implements Runnable{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            try
            {
                Thread.sleep(500,46);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            // System.out.println(i+" "+this.getID()); this keyword will show error and we need to use the Thread class explicitely
            System.out.println(i+" "+Thread.currentThread().getId());
        }
    }
    public static void main(String[] args) {
        RunnableInterface obj1 = new RunnableInterface();
        RunnableInterface obj2 = new RunnableInterface();
        Thread o1 = new Thread(obj1);
        Thread o2 = new Thread(obj2);
        o1.start();
        o2.start();
    }
}
