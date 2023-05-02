package association;

/*
With an aggregation, the child can exist independently of the parent.
The child can be created and destroyed without affecting the parent.
The child can be shared with other parents.
The child can only have one parent at a time.

In the example below, the Customer (parent) class has an Address (child) object.
 */
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