package ConceptualLearning.Number3;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("JINI", 0);

        bankAccount.checkBalance();

        bankAccount.deposit(50000);

        bankAccount.withdraw(70000);

        bankAccount.checkBalance();


        /*
                    출금 성공 여부를 boolean으로 반환해서 처리하기
                    지금은 출금 실패 메시지만 나오는데, 실제 프로그램은 보통 출금 성공 여부를 반환해서 다른 로직에 활용해.
                 * public boolean withdraw(int amount) {
                if (amount > 0 && balance >= amount) {
                    balance -= amount;
                    System.out.println(amount + "원을 출금합니다. 현재 잔액은 " + balance + "원 입니다.");
                    return true;
                } else {
                    System.out.println("출금 금액이 0원 이상이 아니거나 잔액이 부족하여 출금할 수 없습니다.");
                    return false;
                }
            }

                *
                * 입출금 내역(트랜잭션 기록) 추가하기
                잔액만 보여주는 게 아니라, 입금, 출금 기록을 리스트에 저장하고 출력하면 더 ‘실제 은행 느낌’이 난다.
                import java.util.ArrayList;
                import java.util.List;

                public class BankAccount {
                    private String accountHolder;
                    private int balance;
                    private List<String> transactionHistory = new ArrayList<>();

                    // 기존 코드에 deposit, withdraw 내부에
                    // transactionHistory.add("입금 50000원 - 잔액: ..."); 같은 기록 추가 가능

                    public void printTransactionHistory() {
                        System.out.println("=== 거래 내역 ===");
                        for(String record : transactionHistory) {
                            System.out.println(record);
                        }
                    }
                }

                    *
                    * 잔액 조회 시 통화 포맷 적용하기
                    숫자에 콤마 넣고 원 표시 깔끔하게 하는 것도 고급 느낌.
                    import java.text.NumberFormat;
                    import java.util.Locale;

                    NumberFormat nf = NumberFormat.getInstance(Locale.KOREA);
                    System.out.println(nf.format(balance) + "원");

                    또는 예외처리 도입하기, 잘못된 입출금 금액 입력 시 예외 던지기.




*/



    }
}
