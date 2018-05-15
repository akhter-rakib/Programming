package designPattern.creationalDesignPattern.Prototype;

public class Demo {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("RK");
        bookShop.loadData();
        System.out.println(bookShop);

    }
}
