package ProtoTypeClass;


public class Student implements ProtoType{
     String name;
    String batch;
    int age;
    Student(){};
    Student(Student st) {
       this.name = st.name;
       this.batch = st.batch;
       this.age = st.age;
    }
    @Override
    public Student copy(){
       return new Student(this);
    }

}
