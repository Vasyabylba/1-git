package by.vasyabylba;

public class Computer {
    private String brand;
    private String model;
    private int ramSizeInGB;
    private double processorSpeedGHz;
    private int yearReleased;
    private Motherboard motherboard;

    public Computer(String brand, String model, int ramSizeInGB, double processorSpeedGHz, int yearReleased,
                    Motherboard motherboard) {
        this.brand = brand;
        this.model = model;
        this.ramSizeInGB = ramSizeInGB;
        this.processorSpeedGHz = processorSpeedGHz;
        this.yearReleased = yearReleased;
        this.motherboard = motherboard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamSizeInGB() {
        return ramSizeInGB;
    }

    public void setRamSizeInGB(int ramSizeInGB) {
        this.ramSizeInGB = ramSizeInGB;
    }

    public double getProcessorSpeedGHz() {
        return processorSpeedGHz;
    }

    public void setProcessorSpeedGHz(double processorSpeedGHz) {
        this.processorSpeedGHz = processorSpeedGHz;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramSizeInGB=" + ramSizeInGB +
                ", processorSpeedGHz=" + processorSpeedGHz +
                ", yearReleased=" + yearReleased +
                ", motherboard=" + motherboard +
                '}';
    }

    public void turnOn() {
        System.out.println("Компьютер включен.");
    }

    public void turnOff() {
        System.out.println("Компьютер выключен.");
    }
}