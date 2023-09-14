package HW2.EX3;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Gadget> gadgets;
    private String name;

    public Room(String name) {
        this.gadgets = new ArrayList<>();
        this.name = name;
    }

    public void addGadget(Gadget gadget) {
        gadgets.add(gadget);
    }

    public List<Gadget> getGadgets() {
        return gadgets;
    }

    public String getName() {
        return name;
    }

}
