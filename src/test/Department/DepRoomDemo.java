package test.Department;

import java.util.ArrayList;
import java.util.List;

public class DepRoomDemo {
    public static void main(String[] args) {
        List<Room> rooms1 = new ArrayList<>();
        List<Room> rooms2 = new ArrayList<>();
        List<Room> rooms3 = new ArrayList<>();
        List<Department> departments = new ArrayList<>();
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

        DMS dms = new DMS(1, "room-1");
        DMS dms1 = new DMS(2, "room-3");


    }
}
