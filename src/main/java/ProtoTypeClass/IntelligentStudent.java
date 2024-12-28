package ProtoTypeClass;

public class IntelligentStudent extends Student {
    int iq;
    public IntelligentStudent() {};
    public IntelligentStudent(IntelligentStudent ist) {
        super(ist);
        this.iq=ist.iq;
    }
    @Override
   public IntelligentStudent copy(){
        IntelligentStudent st = new IntelligentStudent(this);
        return st;
   }
}
