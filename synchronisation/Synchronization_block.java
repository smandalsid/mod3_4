class Shared_Resource
{  
  void even(int n)
{
synchronized(this)
{
   for(int i=0;i<=n;i++)
  {  
     if(i%2==0)
     System.out.println("Even numbers from 0 to "+n+ " is "+i);  
   }    
 }  
}
}  
  
public class Synchronization_block{  
public static void main(String args[]){  
 Shared_Resource obj = new Shared_Resource(); 
  
Thread t1=new Thread(){  
public void run(){  
obj.even(10);  
}  
};  
Thread t2=new Thread(){  
public void run(){  
obj.even(20);  
}  
};  
  
t1.start();
/*try
{
t1.join();
}
catch(Exception e)
{
System.out.println(e.getMessage());
}*/
t2.start();  
}  
}  