package src.PrototypeDesignPatternAndRegistry;

public class ProStudent implements Prototype{
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

    private String name;
    private int age;
    private double psp;
    private String batch;
    private double averageBatchPSP;


    @Override
    public ProStudent clone() {
        return null;
    }
}
