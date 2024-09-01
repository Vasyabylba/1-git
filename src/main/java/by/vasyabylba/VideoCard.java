package by.vasyabylba;

public class VideoCard {
    private String brand;
    private String model;
    private int vramInGB;
    private double coreClockMHz;

    public VideoCard(String brand, String model, int vramInGB, double coreClockMHz) {
        this.brand = brand;
        this.model = model;
        this.vramInGB = vramInGB;
        this.coreClockMHz = coreClockMHz;
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

    public int getVramInGB() {
        return vramInGB;
    }

    public void setVramInGB(int vramInGB) {
        this.vramInGB = vramInGB;
    }

    public double getCoreClockMHz() {
        return coreClockMHz;
    }

    public void setCoreClockMHz(double coreClockMHz) {
        this.coreClockMHz = coreClockMHz;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vramInGB=" + vramInGB +
                ", coreClockMHz=" + coreClockMHz +
                '}';
    }
}
