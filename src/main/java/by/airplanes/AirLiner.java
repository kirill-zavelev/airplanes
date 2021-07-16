package by.airplanes;

public class AirLiner extends AirPlane {

    private int passengerCapacity;

    public AirLiner(String type, String brand, int weight, int passengerCapacity) {
        super(type, brand, weight);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public int getAirplaneCapacity() {
        return getAirplaneCapacity() + passengerCapacity;
    }

    @Override
    public int getRangeOfFlight() {
        return getSpeed() + getWeight() + getPassengerCapacity();
    }
}
