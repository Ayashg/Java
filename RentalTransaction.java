package carrentalsystem;

import java.time.LocalDate;

public class RentalTransaction {
    private final Car car;
    private final Customer customer;
    private final LocalDate rentalDate;
    
    public RentalTransaction(Car car, Customer customer) {
        this.car = car;
        this.customer = customer;
        this.rentalDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "RentalTransaction{" + "car=" + car + ", customer=" + customer + ", rentalDate=" + rentalDate + '}';
    }
}