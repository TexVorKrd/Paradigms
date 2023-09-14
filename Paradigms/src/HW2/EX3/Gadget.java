package HW2.EX3;

public class Gadget {
    private int id;
    private GadgetType gadgetType;
    private boolean gadgetStatus;

    public Gadget(int id, GadgetType gadgetType) {
        this.id = id;
        this.gadgetType = gadgetType;
        off();
    }

    public int getId() {
        return id;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public boolean isGadgetStatus() {
        return gadgetStatus;
    }

    public void on() {
        this.gadgetStatus = true;
    }

    public void off() {
        this.gadgetStatus = false;
    }
}
