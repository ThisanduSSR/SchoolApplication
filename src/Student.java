public class Student extends Person {
    private String idNum;
    private double fee;
    private String grade;

    public Student(String name , int age, String gender, String idNum) {
        super(name,age,gender);
        this.idNum = idNum;
    }
    public String getIdNum() {
        return idNum;
    }
    public double getFee() {
        return fee;
    }
    public String getGrade() {
        return grade;
    }
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return super.toString() + ",ID:"+idNum+", fee:"+fee+",grade:"+grade;
    }
}
