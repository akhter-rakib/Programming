package test.carmanagement;

import java.util.List;

public class Model {
    String modleName;
    List<Grade> gradeList;

    public Model(String modleName, List<Grade> gradeList) {
        this.modleName = modleName;
        this.gradeList = gradeList;
    }

    public String getModleName() {
        return modleName;
    }

    public void setModleName(String modleName) {
        this.modleName = modleName;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    @Override
    public String toString() {
        return "Model{" +
                "modleName='" + modleName + '\'' +
                ", gradeList=" + gradeList +
                '}';
    }
}
