package test.carmanagement;

import java.util.ArrayList;
import java.util.List;

public class CarDemo {
    public static void main(String[] args) {
        List<Grade> grades = new ArrayList<>();
        List<Grade> grades1 = new ArrayList<>();
        Grade g1 = new Grade("L");
        Grade g2 = new Grade("M");
        Grade g3 = new Grade("S");
        Grade g4 = new Grade("T");
        grades.add(g1);
        grades.add(g2);
        grades1.add(g3);
        grades1.add(g4);
        Model model = new Model("PREMIO", grades);
        Model model2 = new Model("AllION", grades1);
        List<Model> models = new ArrayList<>();
        models.add(model);
        models.add(model2);
        CarCompany carCompany = new CarCompany("TOYOTA", models);
        //  System.out.println(carCompany.toString());

        carCompany.getModelList().forEach(model1 -> {
            System.out.println(carCompany.getCarCompany());
            System.out.println(model.modleName);
            model1.gradeList.forEach(grade -> {
                System.out.println(grade.getName());
            });
        });


    }
}
