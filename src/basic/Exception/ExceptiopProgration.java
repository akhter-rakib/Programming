package basic.Exception;

//kono method a jodi Exception hoi tahole oi method k je call korsilo sekhane jai to catch Exception there ..ar oi
//khane jodi Exception handle kora na thake tahole abar ae method k je call korse tar kase jai
public class ExceptiopProgration {

    public void p() {
        int a = 10 / 0;
    }

    public void n() {
        p();
    }

    public void m() {
        try {
            n();
        } catch (ArithmeticException a) {
            System.out.println("Exception Handled " + a.getMessage());
        } catch (Exception e) {
            System.out.println("You Exception Report Caught by Exception ");
        }

    }

    public static void main(String[] args) {
        ExceptiopProgration ep = new ExceptiopProgration();
        ep.m();
        System.out.println("Program Foot is Here ");
    }
}
