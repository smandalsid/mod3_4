
// getPriority()-> int value 1 to 10, 1 is minimum 10 is maximum 5 is normal(also the default value)
// setPriority()-> 1 to 10 or MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY

public class Priority extends Thread{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println(this.getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        Priority obj = new Priority();
        Priority obj1 = new Priority();
        System.out.println(obj.getPriority());
        System.out.println(obj1.getPriority());
        System.out.println(obj.getName());
        System.out.println(obj1.getName());
        obj1.setPriority(MAX_PRIORITY);
        obj.setPriority(MIN_PRIORITY);
        obj.start();
        obj1.start();
        obj.getState();
        obj1.getState();
    }   
}
