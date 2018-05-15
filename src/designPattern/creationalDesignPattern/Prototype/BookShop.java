package designPattern.creationalDesignPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private String shopName;
    List<Book> books = new ArrayList<>();

    public void loadData() {
        for (int i = 1; i <= 5; i++) {
            Book book = new Book();
            book.setbId(i);
            book.setBookName("book " + i);
            getBooks().add(book);
        }
    }


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
}
