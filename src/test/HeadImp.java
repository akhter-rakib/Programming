package test;

public class HeadImp extends Studentinfo implements Head {

    @Override
    public void doCommon() {
        setId(1);
        setName("hello girl");
        System.out.println("Do What you want ? ");

    }

    @Override
    public String studentinfo() {
        return ("the Student is " + getName() + "The id is" + getId());
    }


}
