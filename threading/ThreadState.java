class ThreadState extends Thread
{
public void run()  //parallel logics  //runnable state
{
for(int i=0;i<5;i++) 
{
//System.out.println(i+" "+this.getId()+" "+ this.getName());   //blocking the thread/waiting
try
{
Thread.sleep(500,46);
}
catch(InterruptedException e)
{
System.out.println(e.getMessage());
}
System.out.println(i+" "+Thread.currentThread().getId()+" "+ Thread.currentThread().getName());
}
}  //end state
public static void main(String args[])
{
System.out.println(Thread.currentThread().getPriority());
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getState());

 

ThreadState obj=new ThreadState();  //create an object current class 
Thread.State s=obj.getState();  //Thread.State s=obj.currentThread().getState(); -->main thread state
System.out.println(s);  //NEW

 

ThreadState obj1=new ThreadState();
ThreadState obj2=new ThreadState();

 

System.out.println(obj1.getState());

 

System.out.println(obj.getPriority());  //default value is 5
System.out.println(obj1.getPriority());
System.out.println(obj.getName());
System.out.println(obj1.getName());
System.out.println(obj2.getName());
obj.setName("T1");
obj1.setName("T2");
obj.setPriority(MAX_PRIORITY);  //obj.setPriority(10);
obj1.setPriority(1);
obj.start();  //New-State of the thread, will try to execute (public void) run()--Runnable state
            //obj.run();//will become normal method/function
System.out.println(obj.currentThread().getState());

 

try
{
obj.join(100);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
obj1.start(); 
obj2.start();

 


}

 

}