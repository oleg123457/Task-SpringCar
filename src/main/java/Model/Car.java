package Model;

public class Car {


    private String carModel;
    private int carNumber;
    private String carSeries;

    public Car(String carModel, int carNumber, String carSeries) {
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.carSeries = carSeries;
    }

    @Override
    public String toString() {
        return carModel +
                ", " + carNumber +
                ", " + carSeries;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
