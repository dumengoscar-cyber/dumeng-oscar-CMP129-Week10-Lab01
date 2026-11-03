public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("hyundai", "sonata", 2016);
Truck truck = new Truck("ford", "f-150 hybrid", 2021);

car.displayInfo();
car.displayType();
System.out.println();

truck.displayInfo();
truck.displayType();
System.out.println();


    }
    
}
