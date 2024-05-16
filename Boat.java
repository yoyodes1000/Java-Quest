public class Boat extends Vehicle {
    public Boat (String brand, int kilometer) {
        super(brand, kilometer);
    }
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}
