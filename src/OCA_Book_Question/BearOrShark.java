package OCA_Book_Question;

public class BearOrShark {
    public static void main(String[] args) {
        int luck = 10;
       // System.out.println(++luck);
        System.out.println(luck++);
        System.out.println(luck);
        if ((luck > 10 ? luck++ : --luck) < 10) {
            System.out.println("Bear");
        }
        if (luck < 10) System.out.println("shark");
    }
}
