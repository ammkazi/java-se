abstract class Account
{
    public static int counter = 0;
    protected String name;
    protected int accountNumber;
    protected double balance;

    public Account(String name,double balance) {
        counter++;
        accountNumber = counter;
        this.name = name;
        this.balance = balance;
    }
    
    abstract public void print();
    abstract public void deposit(double amount);
    abstract public void withdraw(double amount);

    public void accountInfo()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println();
    }    

}