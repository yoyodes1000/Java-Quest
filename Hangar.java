public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("2CV", 542684);
        Boat boat = new Boat("titanic", 2687);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
