package basic.ofcDemo.DepartmentsWiseRoom;

import java.util.List;

public class DepartMent {
    private int id;
    private String name;
    private List<Room> roomList;

    public DepartMent() {
    }

    public DepartMent(int id, String name, List<Room> roomList) {
        this.id = id;
        this.name = name;
        this.roomList = roomList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return "DepartMent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomList=" + roomList +
                '}';
    }
}
