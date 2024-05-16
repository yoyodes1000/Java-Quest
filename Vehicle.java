public abstract class Vehicle {
    private String brand;
    private int kilometer;
    public Vehicle (String brand, int kilometer) {
        this.brand = brand;
        this.kilometer = kilometer;
    }
    public String getBrand() {
        return this.brand;
    }
    public int getKilometer() {
        return this.kilometer;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }
    public abstract String doStuff();
}
