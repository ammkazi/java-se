class CurrentAccount extends Account
{
    double interestRate;
    public CurrentAccount(String name,double balance, double interestRate) {
        super(name,balance);
        this.interestRate = interestRate;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    public void print()
    {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Interest Rate : " + interestRate);
        System.out.println();
    }
}