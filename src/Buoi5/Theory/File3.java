package Buoi5.Theory;

class Engine {
    private String type;

    public void setType (String type)
    {
        this.type = type;
    }

    public Engine(String type)
    {
        this.type = type;
    }
    public void start() {
        System.out.println("Engine started");
    }
}

class Cars {
    private String brand;
    private Engine e1;

    public Cars(String brand, String engineType)
    {
        this.brand = brand;
        this.e1 = new Engine(engineType);
    }
    public void startCar ()
    {
        System.out.println("Car started");
        e1.start();
    }
}
public class File3 {
    public static void main(String[] args) {
        Cars c = new Cars("Ferrari", "Berlinetta");
        c.startCar();
    }
}
