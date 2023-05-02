public class PojoClass {

    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(123456, 1000, "Frodo Beggins",
                "123 Main St", "Shire");
        System.out.printf("""
                        Account number: %d
                        Balance: %d
                        Name: %s
                        Address: %s
                        Branch: %s
                        ========================================
                        """, account.getNumber(), account.getBalance(), account.getName(),
                account.getAddress(), account.getBranch());

        account.setBalance(1500);
        account.setName("Frodo Baggins");
        account.setAddress(" Bag End, The Hill on the north side, Hobbiton ");

        System.out.printf("""
                        Account number: %d
                        Balance: %d
                        Name: %s
                        Address: %s
                        Branch: %s
                        """, account.getNumber(), account.getBalance(), account.getName(),
                account.getAddress(), account.getBranch());
    }
}

class PersonalAccount {
    private int number;
    private int balance;
    private String name;
    private String address;
    private String branch;

    public PersonalAccount(int number, int balance, String name, String address, String branch) {
        this.number = number;
        this.balance = balance;
        this.name = name;
        this.address = address;
        this.branch = branch;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBranch() {
        return branch;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
