package vehicule;

public class Car {
    private String brand;
    public String model;
    protected double value;
    private static int count = 0;
    public Car() {
        this.brand = "Defaultbrand";
        this.model = "Defaultmodel";
        this.value = 0.0;
        count++;
    }
    public Car(String brand, String model, double value) {
        this.brand = brand;
        this.model = model;
        this.value = value;
        count++;
    }
    public void showInfo() {
        System.out.println("[Car] brand=" + brand + ", model=" + model + ", value=" + value);
    }
    public static void howManyCars() {
        System.out.println("[Car] There is currently " + count + " car(s).");
    }
    
    protected String getBrand() {
        return brand;
    }
}
