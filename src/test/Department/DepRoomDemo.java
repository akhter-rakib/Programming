package test.Department;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DepRoomDemo {
    public static void main(String[] args) {
        List<Room> rooms1 = new ArrayList<>();
        List<Room> rooms2 = new ArrayList<>();
        List<Room> rooms3 = new ArrayList<>();
        List<Department> departments = new ArrayList<>();
        List<Department> demo = new ArrayList<>();
        List<DMS> dms = new ArrayList<>();

        Room room1 = new Room(1, "Room-1");
        Room room2 = new Room(2, "Room-2");
        Room room3 = new Room(3, "Room-3");

        rooms1.add(room1);
        rooms1.add(room2);
        rooms1.add(room3);

        rooms2.add(room2);
        rooms2.add(room3);

        rooms3.add(room3);

        Department department1 = new Department(1, "Eye Department", rooms1);
        Department department2 = new Department(2, "Male", rooms2);
        Department department3 = new Department(3, "Female Department", rooms3);
        departments.add(department1);
        departments.add(department2);
        departments.add(department3);
        demo.addAll(departments);

        DMS dms1 = new DMS(1, "room-1");
        DMS dms2 = new DMS(2, "room-2");
        dms.add(dms1);
        dms.add(dms2);

        Room rm = null;
        List<Room> roomList = new ArrayList<>();
        ArrayList<Department> dp = new ArrayList<>();

        for (Department department : departments) {
            for (Room room : department.getRoomList()) {
                for (DMS dm : dms) {
                    if (room.getId() !=(dm.getId())) {
                        //department.getRoomList().remove(room);

                    }
                }
            }
        }
        for (Department department : demo) {
            System.out.println(department.toString());
        }
    }
}
