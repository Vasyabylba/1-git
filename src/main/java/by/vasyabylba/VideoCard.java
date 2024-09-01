package by.vasyabylba;

public class VideoCard {
    private String brand;
    private String model;
    private int vramInGB;
    private double coreClockMHz;
    private double bandwidthGBps;

    public VideoCard(String brand, String model, int vramInGB, double coreClockMHz, double bandwidthGBps) {
        this.brand = brand;
        this.model = model;
        this.vramInGB = vramInGB;
        this.coreClockMHz = coreClockMHz;
        this.bandwidthGBps = bandwidthGBps;
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

    public double getBandwidthGBps() {
        return bandwidthGBps;
    }

    public void setBandwidthGBps(double bandwidthGBps) {
        this.bandwidthGBps = bandwidthGBps;
    }

    @Override
    public String toString() {
        return "VideoCard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vramInGB=" + vramInGB +
                ", coreClockMHz=" + coreClockMHz +
                ", bandwidthGBps=" + bandwidthGBps +
                '}';
    }
}
