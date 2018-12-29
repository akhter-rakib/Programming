package basic.ofcDemo;

public class Obs {
    private Integer doctorId;
    private String diagonesisName;

    public Obs() {
    }

    public Obs(Integer doctorId, String diagonesisName) {
        this.doctorId = doctorId;
        this.diagonesisName = diagonesisName;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDiagonesisName() {
        return diagonesisName;
    }

    public void setDiagonesisName(String diagonesisName) {
        this.diagonesisName = diagonesisName;
    }
}
