package src.BuilderDesignPattern;

public class BuilderClient {
    public static void main(String[] args) {
        Student.StudentBuilder sb= Student.getBuilder();
        sb.setName("Ravi");
        sb.setAge(19);
        sb.setPsp(51.00f);
        sb.setGradYear(2021);
        sb.setUnivName("UoH");
        sb.setId("20MCMT17");
        Student s1 = sb.build();
        System.out.println(s1.getAge());

        Student.StudentBuilder b1 = Student.getBuilder();
        b1.setName("Ravish");
        b1.setAge(25);
        b1.setPsp(51.00f);
        b1.setGradYear(2019);
        b1.setUnivName("UoH");
        b1.setId("17MCMT17");
        Student s2 = b1.build();
        System.out.println(s2.getAge());
    }
}
