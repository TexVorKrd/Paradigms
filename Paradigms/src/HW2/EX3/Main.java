package HW2.EX3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room("Кабинет 1");
        Room room2 = new Room("Кабинет 2");
        Room room3 = new Room("Ресепшн");
        Room room4 = new Room("Кухня");


        //Добавить новое устройство в комнату.
        room1.addGadget(new Gadget(1, GadgetType.Computer));
        room1.addGadget(new Gadget(2, GadgetType.Computer));
        room1.addGadget(new Gadget(3, GadgetType.Router));
        room1.addGadget(new Gadget(4, GadgetType.Lamp));
        room1.addGadget(new Gadget(5, GadgetType.Printer));

        room2.addGadget(new Gadget(6, GadgetType.Computer));
        room2.addGadget(new Gadget(7, GadgetType.Computer));
        room2.addGadget(new Gadget(8, GadgetType.Lamp));

        room3.addGadget(new Gadget(9, GadgetType.Computer));
        room3.addGadget(new Gadget(10, GadgetType.Lamp));

        room4.addGadget(new Gadget(11, GadgetType.Lamp));


        //Включить или выключить устройство в комнате.
        room1.getGadgets().get(0).on();
        room1.getGadgets().get(2).on();
        room1.getGadgets().get(3).on();
        room1.getGadgets().get(4).on();

        room2.getGadgets().get(0).on();

        Office office = new Office();
        office.add(room1);
        office.add(room2);
        office.add(room3);
        office.add(room4);

        //Поиск по статусу
        System.out.println(office.findByStatus(true));

        //Поиск по типу
        System.out.println(office.findByType(GadgetType.Computer));

        //Получить список всех устройств в конкретной комнате.
        List<Gadget> gadgets = office.getRooms().get(0).getGadgets();

        //Подсчитать общее количество устройств каждого типа в офисе.
        office.countItemsByType();
    }
}
