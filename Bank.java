public class Bank {
    private Customer[] customers = new Customer[10];
    private int numberOfCustomers = 0;

    public void addCustomer(String firstName, String lastName) {
        if (numberOfCustomers < 10) {
            customers[numberOfCustomers] =
                    new Customer(firstName, lastName);
            numberOfCustomers++;
        }
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}