abstract class Cars
{
    abstract void Start();
}
interface printName
{
    abstract void carName();
}
class Maruti extends Cars implements printName
{
    String manufacturer, model;
    Maruti(String manufacturer, String model)
    {
        this.manufacturer = manufacturer;
        this.model = model;

    }
    public void Start()
    {
        System.out.println("Starting my Maruti");
    }
    public void carName()
    {
        System.out.println("This is a "+manufacturer+ " " +model);
    }
}
class Hyundai extends Cars implements printName
{
    String manufacturer, model;
    Hyundai(String manufacturer, String model)
    {
        this.manufacturer = manufacturer;
        this.model = model;

    }
    public void Start()
    {
        System.out.println("Starting my Hyundai");
    }
    public void carName()
    {
        System.out.println("This is a "+manufacturer+ " " +model);
    }
}
 class RunnerClass
{
    public static void main(String[] args)
    {
        Maruti m =  new Maruti("Maruti Suzuki","Alto");
        m.Start();
        m.carName();

        Hyundai h = new Hyundai("Hyundai","i10");
        h.Start();
        h.carName();
    }
}