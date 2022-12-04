package gof.dp03;

public class Computer {

    private String processor;
    private String motherboard;
    private String ram;
    private String hardDisk;

    private String cdRom;
    private String graphicsCard;
    private String blueTooth;

    public Computer(ComputerBuilder builder) {
        this.processor = builder.getProcessor();
        this.motherboard = builder.getMotherboard();
        this.ram = builder.getRam();
        this.hardDisk = builder.getHardDisk();
        this.cdRom = builder.getCdRom();
        this.graphicsCard = builder.getGraphicsCard();
        this.blueTooth = builder.getBlueTooth();
    }

    // only getters, no setters
    public String getProcessor() {
        return processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public String getCdRom() {
        return cdRom;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getBlueTooth() {
        return blueTooth;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                ", cdRom='" + cdRom + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", blueTooth='" + blueTooth + '\'' +
                '}';
    }
}
