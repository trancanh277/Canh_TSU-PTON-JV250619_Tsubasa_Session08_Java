package baitap04;

public class baitap04 {
    public static void main(String[] args) {
        BankAccount bankAccountA = new BankAccount("A001", "Nguyễn Văn A", "0123456789");
        BankAccount bankAccountB = new BankAccount("B001", "Nguyễn Văn B", "0987654321");
        bankAccountA.deposit(1000);
        double transferAmount = 300;
        bankAccountA.withdraw(transferAmount);
        bankAccountB.deposit(transferAmount);

        bankAccountA.displayBalance();
        bankAccountB.displayBalance();
    }
}
