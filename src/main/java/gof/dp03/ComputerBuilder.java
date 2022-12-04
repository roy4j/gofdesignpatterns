package gof.dp03;

public class ComputerBuilder {

    private String processor;
    private String motherboard;
    private String ram;
    private String hardDisk;

    private String cdRom;
    private String graphicsCard;
    private String blueTooth;

    public ComputerBuilder(String processor, String motherboard, String ram) {
        // mandatory properties
        this.processor = processor;
        this.motherboard = motherboard;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public ComputerBuilder processor(String processor) {
        this.processor = processor;
        return this;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public ComputerBuilder motherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public ComputerBuilder ram(String ram) {
        this.ram = ram;
        return this;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public ComputerBuilder hardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getCdRom() {
        return cdRom;
    }

    public ComputerBuilder cdRom(String cdRom) {
        this.cdRom = cdRom;
        return this;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public ComputerBuilder graphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public String getBlueTooth() {
        return blueTooth;
    }

    public ComputerBuilder blueTooth(String blueTooth) {
        this.blueTooth = blueTooth;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}
