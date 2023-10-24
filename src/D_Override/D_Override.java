package D_Override;

public class D_Override {

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();

        Car car=new Car();
        car.getwheel();
        System.out.println( car.getwheel());
        car.getColor();
        System.out.println(vehicle.getwheel());
        vehicle.getwheel();
        vehicle.getColor();



        //casting

         float numfloat= 32.8f;
        int numint = (int) numfloat;
        System.out.println(numint);
    }
}
