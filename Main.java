public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Rasyad", "Al-Kautsar");

        Customer customer = bank.getCustomer(0);

        Account akun1 = new Account(5000000);
        Account akun2 = new Account(2000000);

        customer.setAccount(akun1);
        customer.setAccount(akun2);

        System.out.println("Nasabah: "
                + customer.getFirstName() + " "
                + customer.getLastName());

        System.out.println("Punya "
                + customer.getNumOfAccounts()
                + " akun bank.");

        System.out.println("Saldo awal: Rp"
                + akun1.getBalance());

        akun1.deposit(2000000);

        System.out.println("Habis deposit: Rp"
                + akun1.getBalance());

        akun1.withdraw(150000);

        System.out.println("Habis ditarik 150rb: Rp"
                + akun1.getBalance());
    }
}