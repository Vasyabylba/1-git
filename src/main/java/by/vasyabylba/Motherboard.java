package by.vasyabylba;

public class Motherboard {
    private String brand;
    private String model;
    private String chipset;
    private int ramSlots;
    private int maxSupportedRAM;

    public Motherboard(String brand, String model, String chipset, int ramSlots, int maxSupportedRAM) {
        this.brand = brand;
        this.model = model;
        this.chipset = chipset;
        this.ramSlots = ramSlots;
        this.maxSupportedRAM = maxSupportedRAM;
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

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getMaxSupportedRAM() {
        return maxSupportedRAM;
    }

    public void setMaxSupportedRAM(int maxSupportedRAM) {
        this.maxSupportedRAM = maxSupportedRAM;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", chipset='" + chipset + '\'' +
                ", ramSlots=" + ramSlots +
                ", maxSupportedRAM=" + maxSupportedRAM +
                '}';
    }
}
