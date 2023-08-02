package src.BuilderDesignPattern;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public float getPsp() {
        return psp;
    }

    public void setPsp(float psp) {
        this.psp = psp;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;
    private int age;
    private int gradYear;
    private float psp;
    private String univName;
    private String id;

    Student(StudentBuilder builder){
        if(builder.getGradYear() > 2022){
            throw new RuntimeException("Graduation Year should be less than or equal to 2022");
        }

        if(builder.getAge() > 25 || builder.getAge() < 21 ){
            throw new RuntimeException("Age should be between 21 to 25 ");
        }

        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
        this.univName = builder.getUnivName();
        this.id = builder.getId();
    }
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
    public static class StudentBuilder{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getGradYear() {
            return gradYear;
        }

        public void setGradYear(int gradYear) {
            this.gradYear = gradYear;
        }

        public float getPsp() {
            return psp;
        }

        public void setPsp(float psp) {
            this.psp = psp;
        }

        public String getUnivName() {
            return univName;
        }

        public void setUnivName(String univName) {
            this.univName = univName;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        private int age;
        private int gradYear;
        private float psp;
        private String univName;
        private String id;

        private StudentBuilder(){}

        public Student build(){
            return new Student(this);
        }
    }
}
