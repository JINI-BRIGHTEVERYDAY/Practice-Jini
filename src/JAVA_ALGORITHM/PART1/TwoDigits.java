package JAVA_ALGORITHM.PART1;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 양수를 입력하세요.");

        do {
            System.out.println("no값 : ");
            no = stdIn.nextInt();
        } while (no < 10 || no > 99); // 둘 중 하나라도 만족하면
        // while (no >= 10 && no <= 99)

        System.out.println("변수 no 값은 " + no + "이 되었습니다. ");
    }
}
