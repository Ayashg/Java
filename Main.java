package carrentalsystem;

public class Main {
    public static void main(String[] args) {
        RentalAgency agency;
        agency = new RentalAgency();
        Car car1 = new Car("ABC123", "Toyota Camry");
        Customer customer1 = new Customer("John Doe", "CUST001");

        agency.addCar(car1);
        agency.addCustomer(customer1);
        agency.rentCar(customer1, "ABC123");
        System.out.println(car1);
    }
}