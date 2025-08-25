public class MultipleInherietanceUsingInterfaces {
    public static void main(String[] args) {
        AmphibiousVehicle av = new AmphibiousVehicle();
        av.sail();
        av.fly();

    }
}
interface Boat{
    void sail();
}
interface Plane{
    void fly();
}
class AmphibiousVehicle implements Boat, Plane{
    @Override
    public void sail() {
        System.out.println("Sailing on water");
    }

    @Override
    public void fly() {
        System.out.println("Flying in the sky");
    }
}
