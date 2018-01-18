package test;

public class TestValueCheckerImp implements ValueChecker {
    private String lastMessage = "";

    @Override
    public boolean checkValue(String value) {
        boolean msg = false;
        if (value.equalsIgnoreCase("OPD")) {
            this.lastMessage = "Please Check our Body";
            msg = true;
        } else {
           this.lastMessage = "Please Check our Legs";
        }
        return msg;
    }

    @Override
    public String getMessag() {
        return lastMessage;
    }
}
//https://softwareengineering.stackexchange.com/questions/274096/my-value-checker-function-needs-to-return-both-a-boolean-and-a-message
