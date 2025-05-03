package JAVA_ALGORITHM;

// + 와 -를 번갈아 출력

import java.util.Scanner;

public class Alternative2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다. ");

        // 변수 n값을 읽어들이는 코드가 필요함

        System.out.print("n값: ");
        n = stdIn.nextInt(); // 사용자로부터 입력 받는 코드 추가


        for (int i = 0; i < n /2 ; i++)
            System.out.println("+-");

        if (n % 2 != 0)
            System.out.println("+");

            stdIn.close();
            // 리소스 정리 (선택사항이지만 좋은 습관이 될 수 있다)


    }
}
