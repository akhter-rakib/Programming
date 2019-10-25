package OCA_Book_Question;
/*Within a constructor, you can use the this keyword to invoke another constructor in the same class*/
public class Egret {
    private String color;
    private String name;

    public Egret() {
        this("white","Harun");
        /*Within a constructor, you can use the this keyword to invoke another constructor in the same class*/
    }

    public Egret(String color) {
        this.color = color;
    }

    public Egret(String color, String name) {
        this("kobir");
    }

    public static void main(String[] args) {
        Egret egret = new Egret();
        System.out.println(egret.color+" " +egret.name);
    }
}
