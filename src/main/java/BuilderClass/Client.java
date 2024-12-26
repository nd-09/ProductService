package BuilderClass;

public class Client {
    public static void main(String[] args) {
        BuilderClass student= BuilderClass.getBuilder().setAge(19).setGender("MALE").setName("NAVDEEP").build();
        System.out.println("Student name:"+" "+student.getName());
        System.out.println("Student age:"+" "+student.getAge());
        System.out.println("Student Gender:"+" "+student.getGender());
        System.out.println();
        BuilderClass st2= BuilderClass.getBuilder().setName("Mayank").setAge(20).setGender("MALE").build();
        System.out.println("st2 name:"+" "+st2.getName());
        System.out.println("st2 age:"+" "+st2.getAge());
        System.out.println("st2 Gender:"+" "+st2.getGender());

    }
}
