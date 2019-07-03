
import java.io.Serializable;

public class Car implements Serializable {

    private String carMake;
    private String carModel;
    private String carColour;
    private String carYear;
    private String horsePower;
    private String carTransmission;
    private double carPrice;


    public Car(String carMake, String carModel, String carColour, String carYear, String horsePower,
               String carTransmission, double carPrice) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carColour = carColour;
        this.carYear = carYear;
        this.horsePower = horsePower;
        this.carTransmission = carTransmission;
        this.carPrice = carPrice;


    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getCarMake() {
        return carMake;
    }


    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }


    public String getCarModel() {
        return carModel;
    }


    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }


    public String getCarColour() {
        return carColour;
    }


    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getCarYear() {
        return carYear;
    }


    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }


    public String getCarTransmission() {
        return carTransmission;
    }


    public void setCarTransmission(String carTransmission) {
        this.carTransmission = carTransmission;
    }


    public double getCarPrice() {
        return carPrice;
    }


    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }






}
