package OCA_Book_Question;

public interface HashTail {
}

abstract class Puma implements HashTail {
    protected int getTailLength() {
        return 4;
    }

   /* public class Cougar extends Puma {
        public static void main(String[] args) {
            Puma puma = new Puma();
            System.out.println(puma.getTailLength());
        }

        public int getTailLength(int length) {
            return 2;
        }
    }*/
}
