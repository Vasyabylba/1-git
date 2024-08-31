package by.vasyabylba;

public class Computer {
    private String brand;
    private String model;
    private int ramSizeInGB;
    private double processorSpeedGHz;
    private int yearReleased;

    public Computer(String brand, String model, int ramSizeInGB, double processorSpeedGHz, int yearReleased) {
        this.brand = brand;
        this.model = model;
        this.ramSizeInGB = ramSizeInGB;
        this.processorSpeedGHz = processorSpeedGHz;
        this.yearReleased = yearReleased;
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

    public int getYearReleased() {
        return yearReleased;
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

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramSizeInGB=" + ramSizeInGB +
                ", processorSpeedGHz=" + processorSpeedGHz +
                ", yearReleased=" + yearReleased +
                '}';
    }

    public void turnOn() {
        System.out.println("Компьютер включен.");
    }

    public void turnOff() {
        System.out.println("Компьютер выключен.");
    }
}