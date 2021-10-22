class Customer_naveen1{
    int amount=50000;
    synchronized void withdraw(int amount){
    System.out.println("Withdraw operation begin");
    if(this.amount<amount){
    System.out.println("Less balance - waiting for someone to deposit");
    try{wait();}catch(Exception e){}
    }
    if(this.amount>=amount)
    {
    this.amount-=amount;
    System.out.println("withdraw completed "+"Current Balance "+this.amount);
    }
    else
    {
    System.out.println("withdraw not completed ");
    }
    }
    synchronized void deposit(int amount){
    System.out.println("Deposit operation begin");
    this.amount+=amount;
    System.out.println("Deposit completed" +"Current Balance "+this.amount);
    notify();
    }
    }
    class Customer_Naveen1{
    public static void main(String args[]){
    final Customer_naveen1 c=new Customer_naveen1();
    
    //case-1
    /* new Thread(){
    public void run(){c.withdraw(65000);}
    }.start();
    new Thread(){
    public void run(){c.deposit(20000);}
    }.start(); */
    
    // case-2
    new Thread(){
    public void run(){c.withdraw(65000);}
    }.start();
    new Thread(){
    public void run(){c.deposit(14000);}
    }.start();
    }}