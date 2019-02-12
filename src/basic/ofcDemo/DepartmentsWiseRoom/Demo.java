package basic.ofcDemo.DepartmentsWiseRoom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Room> roomOne = new ArrayList<>();
        List<Room> roomTwo = new ArrayList<>();
        List<Room> roomThree = new ArrayList<>();
        List<DepartMent> departMents = new ArrayList<>();
        List<DMS> dms = new ArrayList<>();

        Room room1 = new Room(1, "Room - 1");
        Room room2 = new Room(2, "Room - 2");
        Room room3 = new Room(3, "Room - 3");

        DMS dms1 = new DMS(1, "room -1");
        DMS dms2 = new DMS(2, "room -2");
        DMS dms3 = new DMS(3, "room -3");
        DMS dms4 = new DMS(4, "room -4");
        dms.add(dms1);
        dms.add(dms2);
        dms.add(dms3);
        dms.add(dms4);

        roomOne.add(room1);

        roomTwo.add(room2);
        roomTwo.add(room3);

        roomThree.add(room1);
        roomThree.add(room2);
        roomThree.add(room3);

        DepartMent departMent1 = new DepartMent(1, "Eye", roomOne);
        DepartMent departMent2 = new DepartMent(2, "Male", roomTwo);
        DepartMent departMent3 = new DepartMent(3, "Female", roomThree);
       /* departMents.add(departMent1);
        departMents.add(departMent2);*/
        departMents.add(departMent3);


            List<Room> room = departMent3.getRoomList();
            Iterator<Room> roomIterator = room.iterator();
            boolean needTobeDeleted = true;
            Room roomNext;
            while (roomIterator.hasNext()) {
                roomNext = roomIterator.next();
                for (DMS dms5 : dms) {
                    if (roomNext.getId() == dms5.getId()) {
                        needTobeDeleted = false;
                    }
                }
                if (needTobeDeleted) {
                    roomIterator.remove();
                }
            }

        System.out.println(departMents.toString());
    }
}
