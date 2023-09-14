package HW2.EX3;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<Room> rooms;

    public Office() {
        this.rooms = new ArrayList<>();
    }

    public void add(Room room) {
        this.rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public String findByStatus(boolean status) {
        StringBuilder items = new StringBuilder();
        String fStatus = "Off";
        if (status) fStatus = "On";
        items
                .append("Поиск устройств в состоянии ")
                .append(fStatus)
                .append("\n");
        for (Room room : rooms) {
            boolean notFind = true;
            items
                    .append("--Помещение ")
                    .append(room.getName())
                    .append("\n");
            for (Gadget gadget : room.getGadgets()) {
                if (gadget.isGadgetStatus() == status) {
                    items
                            .append(gadget.getId())
                            .append(" - ")
                            .append(gadget.getGadgetType())
                            .append("\n");
                    notFind = false;
                }
            }
            if (notFind) items.append("В комнате устройства не найдены\n");
        }
        return items.toString();
    }

    public String findByType(GadgetType gType) {
        StringBuilder items = new StringBuilder();
        items
                .append("Поиск устройств типа ")
                .append(gType)
                .append("\n");
        for (Room room : rooms) {
            boolean notFind = true;
            items
                    .append("--Помещение ")
                    .append(room.getName())
                    .append("\n");
            for (Gadget gadget : room.getGadgets()) {
                if (gadget.getGadgetType() == gType) {
                    items
                            .append(gadget.getId())
                            .append(" - ")
                            .append(gadget.getGadgetType())
                            .append("\n");
                    notFind = false;
                }
            }
            if (notFind) items.append("В комнате устройства не найдены\n");
        }
        return items.toString();
    }

    public void countItemsByType() {

        for (GadgetType gType : GadgetType.values()) {
            long count = 0;
            for (Room room : rooms) {
                count += room.getGadgets().stream()
                        .filter(a -> a.getGadgetType().equals(gType))
                        .count();
            }
            System.out.println(gType + " - " + count);
        }
    }
}
