package ConceptualLearning.Number3;

public class BankAccount {
    private String accountHolder;
    private int balance;

    public BankAccount(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + "원을 입금합니다. 현재 잔액은 " + balance + "원 입니다.");
        }else {
            System.out.println("입금 금액이 0원 이상이 아니므로 입금할 수 없습니다.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + "원을 출금합니다. 현재 잔액은 " + balance + "원 입니다.");
        }else {
            System.out.println("출금 금액이 0원 이상이 아니거나 잔액이 부족하여 출금할 수 없습니다.");
        }
    }

    //if (amount > 0 && balance > amount) 이 아니라 if (amount > 0 && balance >= amount)
    // System.out.println(amount + "원을 출금합니다. 현재 잔액은 " + (balance - amount) + "원 입니다.");
    // ->System.out.println(amount + "원을 출금합니다. 현재 잔액은 " +  balance + "원 입니다.");

    public void checkBalance() {
        System.out.println(accountHolder + "님의 현재 잔액은: " + "[" + balance + "]" + "원 입니다.");
    }

}
