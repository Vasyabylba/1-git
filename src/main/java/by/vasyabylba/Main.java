package by.vasyabylba;

public class Main {
    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard("ASUS", "Prime Z590-A", "Intel Z590", 4, 128);
        VideoCard videoCard = new VideoCard("NVIDIA", "GeForce RTX 3080", 10, 1710, 760, "GDDR6X");
        CPU cpu = new CPU("Intel", "Core i7-11700K", 8, 3.6, 125);
        Computer computer = new Computer("Dell", "Inspiron", 16, 2.4, 2022);
        computer.setMotherboard(motherboard);
        computer.setVideoCard(videoCard);
        computer.setCpu(cpu);

        System.out.println("Computer: " + computer);
    }
}