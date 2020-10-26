package test.carmanagement;

import java.util.List;

public class CarCompany {
    private String carCompany;
    private List<Model> modelList;

    public CarCompany(String carCompany, List<Model> modelList) {
        this.carCompany = carCompany;
        this.modelList = modelList;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public List<Model> getModelList() {
        return modelList;
    }

    public void setModelList(List<Model> modelList) {
        this.modelList = modelList;
    }

    @Override
    public String toString() {
        return "CarCompany{" +
                "carCompany='" + carCompany + '\'' +
                ", modelList=" + modelList +
                '}';
    }
}
