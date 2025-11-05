package vehicule;

public class ElectricCar extends Car {
    private int batteryLevel;
    public ElectricCar() {
        super();
        this.batteryLevel = 100;
    }
    public ElectricCar(String name, String model, double value, int batteryLevel) {
        super(name, model, value);
        this.batteryLevel = 0;
    }
    @Override
    public void showInfo() {
        System.out.println("[ElectricCar] name=" + getBrand() + ", model=" + model + ", value=" + value + ", BatteryLevel=" + batteryLevel  );
    }
}
