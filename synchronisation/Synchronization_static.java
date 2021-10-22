class Shared_Resource
{  
synchronized static void even(int n)
{
{
   for(int i=0;i<=n;i++)
  {  
     if(i%2==0)
     System.out.println("Even numbers from 0 to "+n+ " is "+i);  
   }    
 }  
}
}  
  
public class Synchronization_static{  
public static void main(String args[]){  
 Shared_Resource obj = new Shared_Resource(); 
 Shared_Resource obj1 = new Shared_Resource(); 
  
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