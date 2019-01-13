package test.Department;

import java.util.List;

public class Department {
   public  Integer id;
   public String name;
   List<Room> roomList;

    public Department(Integer id, String name, List<Room> roomList) {
        this.id = id;
        this.name = name;
        this.roomList = roomList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomList=" + roomList +
                '}';
    }
}
