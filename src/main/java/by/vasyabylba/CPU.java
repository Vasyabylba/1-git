package by.vasyabylba;

public class CPU {
    private String brand;
    private String model;
    private int cores;
    private double clockSpeedGHz;
    private double tdp;

    public CPU(String brand, String model, int cores, double clockSpeedGHz, double tdp) {
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.clockSpeedGHz = clockSpeedGHz;
        this.tdp = tdp;
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

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }

    public void setClockSpeedGHz(double clockSpeedGHz) {
        this.clockSpeedGHz = clockSpeedGHz;
    }

    public double getTdp() {
        return tdp;
    }

    public void setTdp(double tdp) {
        this.tdp = tdp;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", cores=" + cores +
                ", clockSpeedGHz=" + clockSpeedGHz +
                ", tdp=" + tdp +
                '}';
    }
}
