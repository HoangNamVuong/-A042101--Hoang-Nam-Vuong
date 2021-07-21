package lesson05_access_modifier_static_method_static_property.practice.static_property;

public class MainTestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("honda1","kawasaky1");
        System.out.println(car1.numberOfCars);
        Car car2 = new Car("honda2","kawasaky2");
        System.out.println(car2.numberOfCars);
    }
}
