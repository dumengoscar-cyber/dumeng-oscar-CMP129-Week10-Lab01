//name: oscar dumeng
//date: 11/5/2026
//course: cmp129
//week: 10
//lab: 1

public class VehicleTest {
    public static void main(String[] args) {
        Car car1 = new Car("hyundai", "sonata sport", 2016);
Truck truck1 = new Truck("ford", "f-150 hybrid", 2021);

car1.displayInfo();
car1.displayType();
System.out.println();

truck1.displayInfo();
truck1.displayType();
System.out.println();

 Car car2 = new Car("honda", "crv", 2006);
Truck truck2 = new Truck("honda", "ridgeline", 2019);

car2.displayInfo();
car2.displayType();
System.out.println();

truck2.displayInfo();
truck2.displayType();
System.out.println();

System.out.println("original year" + car1.getYear());

car1.setYear(2015);
car1.setModel("sonata");

System.out.println("updated car information");
car1.displayInfo();

    }
    
}
