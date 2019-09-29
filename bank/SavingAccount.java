class SavingAccount extends Account
{
    double interestRate;
    public SavingAccount(String name,double balance, double interestRate) {
        super(name,balance);
        this.interestRate = interestRate;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }

    public void withdraw(double amount)
    {
        if(balance - amount < 1000)
        {
            System.out.println("Minum Balance should be 1000.");
            System.out.println(" Your Balance : " + balance);
        }
        else
        {
            balance = balance - amount;
            System.out.println("New Balance is : " + balance);
        }
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