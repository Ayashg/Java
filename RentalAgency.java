package carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private final List<Car> cars = new ArrayList<>();
    private final List<Customer> customers = new ArrayList<>();
    private final List<RentalTransaction> transactions = new ArrayList<>();

    public void addCar(Car car) { cars.add(car); }
    public void addCustomer(Customer customer) { customers.add(customer); }
    
    public void rentCar(Customer customer, String registrationNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(registrationNumber) && car.isAvailable()) {
                car.rentCar();
                transactions.add(new RentalTransaction(car, customer));
                return;
            }
        }
        System.out.println("Car not available for rent.");
    }

    public void returnCar(String registrationNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(registrationNumber)) {
                car.returnCar();
                return;
            }
        }
        System.out.println("Car not found.");
    }
}