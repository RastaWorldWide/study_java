package lr2.example7;

class BankAccount implements BankOperations {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Депозит в размере " + amount + " успешно проведен.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Снятие на сумму " + amount + " успешно проведено.");
        } else {
            System.out.println("Недостаточно средств на счете.");
        }
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}

