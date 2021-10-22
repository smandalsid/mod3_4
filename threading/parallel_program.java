// can be done in two ways
// 1. thread class

// lots of inbuilt finctions + run method

// 2. runnable interface

// we cannot use multithreading and it contains only run method alone

// Thread or Runnable -> java.lang.Thread; package

// we should have atleast one method -> run()

class parallel_program extends Thread {
    public void run() // parallel logics //runnable state // atleast one run method should be there
    {
        if ((this.getName()).compareTo("Thread-0")==0) // if we have added the thread's code inside this it would not have worked as we changed the name thus we need getId() which we cannot change at any point like the name
        {

        }
        if (this.getId()==12 || this.getId()==13)
        {
            for (int i = 0; i < 5; i++) {
                System.out.println(this.getName());
                System.out.println(Thread.currentThread().getName()); // same as this keyword
                System.out.println("This is parallel java code " + i); // blocking the thread/waiting
            } // end state
        }
    }   

    public static void main(String args[]) {
        parallel_program obj = new parallel_program(); // create an object current class
        // state
        // obj.run();//will become normal method/function but will give the same output so this is not enough to show parallel 
        parallel_program obj1 = new parallel_program();
        
        System.out.println(obj.getName()); // gives us the name of the thread
        System.out.println(obj1.getName());

        System.out.println(obj.getId());
        System.out.println(obj1.getId());

        obj.start(); // New-State of the thread, will try to execute (public void) run()--Runnable
        obj1.start();

        obj.setName("T1");
        obj1.setName("T2");
    }

}