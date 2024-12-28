package ProtoTypeClass;

public class Client {
    public static void main(String[] args) {
        Student st = new Student();
        st.name="Navdeep";
        st.age=26;
        st.batch="Evening";

        Student st1 = st.copy();

        IntelligentStudent is=new IntelligentStudent();
        is.name=st1.name;
        is.age=st1.age;
        is.batch=st1.batch;
        is.iq=300;


        st1.name="chaged?...";
        IntelligentStudent is2 = is.copy();

        System.out.println(is2);
        System.out.println(is);

        System.out.println(is.name + "2nd obj name : "+ is2.name );
        System.out.println(is.batch+ "2nd obj batch : "+ is2.batch );
        System.out.println(is.age+ "2nd obj age : "+ is2.age );
        System.out.println(is.iq+ "2nd obj iq : "+ is2.iq );

    }
}
