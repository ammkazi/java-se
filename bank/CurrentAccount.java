class CurrentAccount extends Account
{
    double interestRate;
    public CurrentAccount(String name,int accountNumber,double balance, double interestRate) {
        super(name,accountNumber,balance);
        System.out.println("Sub Constructor - Current Account");
        this.interestRate = interestRate;
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