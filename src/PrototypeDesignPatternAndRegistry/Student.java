package src.PrototypeDesignPatternAndRegistry;

public class Student implements Prototype{
    private String name;
    private int age;
    private double psp;
    private String batch;
    private double averageBatchPSP;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAverageBatchPSP(double averageBatchPSP) {
        this.averageBatchPSP = averageBatchPSP;
    }

    public Student(){}

    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batch = student.batch;
        this.averageBatchPSP = student.averageBatchPSP;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
