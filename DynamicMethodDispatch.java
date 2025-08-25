public class DynamicMethodDispatch {
    public static void main(String[] args){
        Doctor doc = new Surgeon();
        doc.treatPatient();
        doc = new GeneralPhysician();
        doc.treatPatient();
        
    }
}
class Doctor{
    void treatPatient(){
        System.out.println("Treating patient");
    }
}
class Surgeon extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("Performing surgery");
    }
}
class GeneralPhysician extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("Prescribing medicine");
    }
}

