class Program{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.sleep();
        emp.walk();
        emp.eat();
        emp.play();
        emp.cleanIndia(4);

        Manager namrah = new Manager();
        System.out.println("~~~~~~~~~");
        namrah.eat();
        namrah.calculateBonus(10000);
        namrah.play();
    }
}