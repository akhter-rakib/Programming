package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        //Traversing Map
        for (Map.Entry<Integer, Book> m : map.entrySet()) {
            System.out.println(m.getKey() + "->" + m.getValue().getId());
        }
    }
}
