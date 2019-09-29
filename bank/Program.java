class Program
{
    public static void main(String[] args) {
       // Account ak = new Account("Aiman Kazi", 1, 1000.00);
       // ak.print(); 

        SavingAccount ub = new SavingAccount("Uzma Bhagwan", 2, 1000.0, 6.5);
        ub.print();
        ub.deposit(100);
        ub.print();

        /*
        CurrentAccount am = new CurrentAccount("Alfiyah Mullah", 3, 10000.00, 3.0 );
        am.print();
        am.deposit(5000);
        am.print();
        */
;    }
}