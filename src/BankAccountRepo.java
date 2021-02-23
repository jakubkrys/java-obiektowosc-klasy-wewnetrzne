public class BankAccountRepo {

    private BankAccount[] accounts;
    private int index = 0;
    private int size;

    public BankAccountRepo(int size) {
        accounts = new BankAccount[size];
    }

    public void add(BankAccount bankAccount) {
        accounts[index++] = bankAccount;
    }

    public void displayAll() {
        for (int i = 0; i < accounts.length && accounts[i] != null; i++) {
            accounts[i].display();
        }
    }
}
