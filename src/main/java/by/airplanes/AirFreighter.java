package by.airplanes;

public class AirFreighter extends AirPlane {

    private int cargoWeight;

    public AirFreighter(String type, String brand, int weight, int cargoWeight) {
        super(type, brand, weight);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public int getAirplaneCapacity() {
        return getAirplaneCapacity() + cargoWeight;
    }

    @Override
    public int getRangeOfFlight() {
        return getSpeed() + getWeight() + getCargoWeight();
    }
}
