public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];
    private int numberOfAccounts = 0;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account account) {
        if (numberOfAccounts < 5) {
            accounts[numberOfAccounts] = account;
            numberOfAccounts++;
        }
    }

    public Account getAccount(int index) {
        return accounts[index];
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
}