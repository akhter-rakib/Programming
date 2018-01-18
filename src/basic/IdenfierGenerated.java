package basic;

import java.util.Calendar;

/**
 * @author Rakib
 */
public class IdenfierGenerated {

    public String identifier(String oldPatientIdentifier) {
        String pID = "";
        Calendar now = Calendar.getInstance();
        String today = String.valueOf(now.get(Calendar.YEAR)).substring(2, 4)
                + String.valueOf(now.get(Calendar.MONTH) + 1) + String.valueOf(now.get(Calendar.DATE));
        String[] IdentifierArray = oldPatientIdentifier.split("-");
        String a = IdentifierArray[0];
        Integer b = Integer.parseInt(IdentifierArray[1]) + 1;
        if (a.equalsIgnoreCase(today)) {
            pID = a + "-" + b;
        } else {
            pID = today + "-" + 1;
        }
        return pID;
    }

    public static void main(String[] args) {
        //Database Collected Id 17y 11 month 8 dd //this is a dateFormated
        String oldPatientIdentifier = "17119-2";

        IdenfierGenerated idenfierGenerated = new IdenfierGenerated();
        String newIdertifier = idenfierGenerated.identifier(oldPatientIdentifier);
        System.out.println("NEW Patient Identifier " + newIdertifier);
    }

}