package by.airplanes;

public class AirPlane implements AirplaneInfo {

    private String type;
    private String brand;
    private int weight;
    private int speed;
    private int rangeOfFlight;

    public AirPlane(String type, String brand, int weight) {
        this.type = type;
        this.brand = brand;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAirplaneCapacity() {
        return speed * weight;
    }

    public int getRangeOfFlight() {
        return speed + weight;
    }

    public String getAirplaneInfo() {
        return getType() + getBrand();
    }
}
