package gof.dp02.product;

import gof.dp02.product.motherboard.Motherboard;
import gof.dp02.product.processor.Processor;
import gof.dp02.product.ram.RAM;

public class Computer {
    private Processor processor;
    private Motherboard motherboard;
    private RAM ram;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer[Processor: " + this.getProcessor().getName()
                + ", Motherboard: " + this.getMotherboard().getName()
                + ", RAM: " + this.getRam().getName() + "]";
    }
}