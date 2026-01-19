public class Encapsulation {
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);

        System.out.println(bankAccount.getBalance());
    }
}

class BankAccount {
    private int balance;

    public void deposit (int amount ) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}