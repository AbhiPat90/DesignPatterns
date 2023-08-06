package src.PrototypeDesignPatternAndRegistry;

public class IntelStudent extends Student{

    private int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelStudent(){}

   public IntelStudent(IntelStudent intelStudent){
        super(intelStudent);
        setIq(intelStudent.iq);
   }

    public IntelStudent clone(){
        return new IntelStudent(this);
    }
}

