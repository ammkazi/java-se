class Employee implements Person, Sports, SwachBharat
{
    public void eat(){
        System.out.println("I eat with right hand");
    }
    public void sleep(){
        System.out.println("I sleep");
    }
    public void walk(){
        System.out.println("I walk");
    }

    public void play()
    {
        System.out.println("I play cricket");
    }

    public void cleanIndia(int hours)
    {
        System.out.println("i work " + hours + " hours for swach bharat");

    }
}