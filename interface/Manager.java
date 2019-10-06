class Manager extends Employee implements IManager
{
    private double bonus;

    public void takeInterview()
    {
        System.out.println("I take interviews");
    }

    public void calculateBonus(double salary)
    {
        bonus = salary / 10; 
        System.out.println("Bonus : " +bonus);
    }
    public void eat()
    {
        System.out.println("I eat with left hand.");
    }
}