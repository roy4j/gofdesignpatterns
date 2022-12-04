package gof.dp09;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Item {

    List<Item> children = new ArrayList<Item>();

    public Folder(String name) {
        this.name = name;
        depth = 1;
    }

    public void add(Item item) {
        item.depth = this.depth + 1;
        children.add(item);
    }

    public void remove(Item item) {
        children.remove(item);
    }

    public String toString() {
        String s = name;
        for (Item m : children) {
            s += "\n" + pad(m.depth) + m.toString();
        }
        return s;
    }

    public String pad(int i) {
        String padding = " ";
        for (int p = 0; p < i; p++) {
            padding += padding;
        }
        return padding;
    }
}