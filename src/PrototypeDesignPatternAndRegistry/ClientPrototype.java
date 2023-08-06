package src.PrototypeDesignPatternAndRegistry;

public class ClientPrototype {

    private static void fillRegistry(StudentRegistry studentRegistry){

        Student june22 = new Student();
        june22.setBatch(Batches.JUNE22.toString());
        june22.setAverageBatchPSP(92.00);
        studentRegistry.register(Batches.JUNE22.toString(), june22);

        Student march23 = new Student();
        march23.setBatch(Batches.MARCH23.toString());
        march23.setAverageBatchPSP(67.00);
        studentRegistry.register(Batches.MARCH23.toString(), march23);

        Student aug22 = new Student();
        aug22.setBatch(Batches.AUGUST22.toString());
        aug22.setAverageBatchPSP(89.00);
        studentRegistry.register(Batches.AUGUST22.toString(), aug22);


        IntelStudent june22IntelStudent = new IntelStudent();
        june22IntelStudent.setBatch(Batches.JUNE22_INTEL.toString());
        june22IntelStudent.setAverageBatchPSP(98.99);
        june22IntelStudent.setIq(151);
        studentRegistry.register(Batches.JUNE22_INTEL.toString(), june22IntelStudent);

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student raj = studentRegistry.getRegistry(Batches.JUNE22.toString()).clone();
        raj.setName("Raj");
        raj.setPsp(78.00);
        raj.setAge(25);

        Student rakesh = studentRegistry.getRegistry(Batches.MARCH23.toString()).clone();
        rakesh.setName("Rakesh");
        rakesh.setAge(31);
        rakesh.setPsp(92.00);

        Student ramya = studentRegistry.getRegistry(Batches.AUGUST22.toString()).clone();
        ramya.setName("Ramya");
        ramya.setAge(29);
        ramya.setPsp(93.00);

        Student  Akshay = studentRegistry.getRegistry(Batches.JUNE22_INTEL.toString()).clone();
        Akshay.setName("Akshay");
        Akshay.setAge(26);
        Akshay.setPsp(99.99);


        System.out.println("Debug");
    }
}
