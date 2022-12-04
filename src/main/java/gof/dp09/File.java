package gof.dp09;

public class File extends Item {

    public File(String name) {
        this.name = name;
        depth = 1;
    }

    public String toString() {
        return name;
    }
}