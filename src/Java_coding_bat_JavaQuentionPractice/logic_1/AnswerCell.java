package Java_coding_bat_JavaQuentionPractice.logic_1;
/*Your cell phone rings.Return true if you should answer it.
        Normally you answer,except in the morning you only answer
        if it is your mom calling.In all cases,if you are asleep,you do not answer.
        answerCell(false,false,false) → true
        answerCell(false,false,true) → false
        answerCell(true,false,false) → false*/

public class AnswerCell {

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        boolean status = false;
        if (!isAsleep) {
            if (isMom) {
                status = true;
            } else {
                if (!isMorning) {
                    status = true;
                } else {
                    status = false;
                }
            }
        }
        return status;
    }

    public static void main(String[] args) {
        AnswerCell answerCell = new AnswerCell();
        boolean status = answerCell.answerCell(false, false, false);
        System.out.println(status);
    }

}
