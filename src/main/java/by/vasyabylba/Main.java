package by.vasyabylba;

public class Main {
    public static void main(String[] args) {
        Motherboard myMotherboard = new Motherboard("ASUS", "Prime Z590-A", "Intel Z590", 4, 128);
        Computer myComputer = new Computer("Dell", "Inspiron", 8, 2.4, 2022, myMotherboard);

        System.out.println("Мой компьютер: " + myComputer);
    }
}