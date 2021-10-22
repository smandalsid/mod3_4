
class Money {
    int amount=0;

    public synchronized void withdraw(int amount)
    {
        if (amount>this.amount)
        {
            System.out.println("Not enough balance");
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
        if (amount<=this.amount)
        {
            this.amount-=amount;
            System.out.println("Amount debited");
            System.out.println("Current balance: "+this.amount);
        }
    }
    public synchronized void deposit(int amount)
    {
        this.amount+=amount;
        System.out.println("Amount deposited");
        System.out.println("Current balance: "+this.amount);
        notify();
    }
}

public class Siddharth {
    public static void main(String[] args) {
        Money m = new Money();
        new Thread(){
            public void run()
            {
                m.withdraw(10000);
            }
        }.start();;
        new Thread() {
            public void run()
            {
                m.deposit(20000);
            }
        }.start();
    }
}