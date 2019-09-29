class Program
{
    public static void main(String[] args) {

        SavingAccount ub = new SavingAccount("Uzma Bhagwan", 1000.0, 6.5);
        ub.accountInfo();
        ub.deposit(100);
        ub.withdraw(1500);
        ub.print();
        
        CurrentAccount am = new CurrentAccount("Alfiyah Mullah", 10000.00, 3.0 );
        am.accountInfo();
        am.deposit(5000);
        am.print();

        CurrentAccount gk = new CurrentAccount("Gazala Khan", 10000.00, 3.0 );
        gk.accountInfo();
        gk.deposit(5000);
        gk.print();

        System.out.println("Total Accounts : " + Account.counter);
    }
}