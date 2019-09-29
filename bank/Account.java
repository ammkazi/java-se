class Account
{
    protected String name;
    protected int accountNumber;
    protected double balance;

    public Account(String name,int accountNumber,double balance) {
        System.out.println("Super Constructor");
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Work Done Successfully.");
    }
    
    public void accountInfo()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println();
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    

}