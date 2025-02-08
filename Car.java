package carrentalsystem;

public class Car {
    private final String registrationNumber;
    private final String model;
    private boolean isAvailable;

    public Car(String registrationNumber, String model) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.isAvailable = true;
    }

    public String getRegistrationNumber() { return registrationNumber; }
    public String getModel() { return model; }
    public boolean isAvailable() { return isAvailable; }

    public void rentCar() { 
        if (!isAvailable) {
            throw new IllegalStateException("Car is not available for rent");
        }
        this.isAvailable = false; 
    }

    public void returnCar() { 
        this.isAvailable = true; 
    }

    @Override
    public String toString() {
        return "Car{" + "registrationNumber='" + registrationNumber + '\'' + ", model='" + model + '\'' + ", isAvailable=" + isAvailable + '}';
    }
}