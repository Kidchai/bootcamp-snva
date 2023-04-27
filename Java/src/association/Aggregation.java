package inheritance;

public class Aggregation {
    public static void main(String[] args) {
        Address address = new Address("Oak Park", "Illinois", "USA");
        Customer customer = new Customer(1, "Kim Chang", address);
        System.out.printf("""
                        Customer id: %d
                        Name: %s
                        City: %s
                        State: %s
                        Country: %s
                        """, customer.id, customer.name, customer.address.city,
                customer.address.state, customer.address.country);
    }
}

class Address {
    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Customer {
    int id;
    String name;
    Address address;

    public Customer(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}