package gof.dp03;

public class Main {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder("Intel i9", "Intel Chipset", "Kingston")
                .hardDisk("Seagate")
                .graphicsCard("Nvidea")
                .blueTooth("D-link")
                .build();

        System.out.println("My Computer: " + computer);
    }
}
