package ex;

public class Customer {
    private String name;
    private float deposit;

    public Customer(String name, float deposit) {
        this.name = name;
        this.deposit = deposit;
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Newaz", 1234.83f);
    }
}

