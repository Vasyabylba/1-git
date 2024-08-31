package by.vasyabylba;

public class Computer {
    private String brand;
    private String model;
    private int ramSizeInGB;
    private double processorSpeedGHz;

    public Computer(String brand, String model, int ramSizeInGB, double processorSpeedGHz) {
        this.brand = brand;
        this.model = model;
        this.ramSizeInGB = ramSizeInGB;
        this.processorSpeedGHz = processorSpeedGHz;
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

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramSizeInGB=" + ramSizeInGB +
                ", processorSpeedGHz=" + processorSpeedGHz +
                '}';
    }
}