package JAVA_ALGORITHM;

import java.util.Scanner;

public class JudgeSign {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하시오.");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("이 수는 양수입니다.");

        else if (n < 0)
            System.out.println("이 수는 음수입니다.");

        // if (n < 0) 비교군 대조해야 함
            //System.out.println("이 수는 음수입니다.");

        else
            System.out.println("이 수는 0 입니다.");
    }
}
