package JAVA_ALGORITHM;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;

        System.out.println("*를 n개 출력하되, w개마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.println("n값: ");
            n = stdIn.nextInt();
        } while(n <= 0); // n <= 0이 된다면 do while루프가 끝나고 다음 루프로 넘어간다

        do {
            System.out.print("w값: ");
            w = stdIn.nextInt();
        } while(w <= 0 || w > n); // w <= 0 || w > n 무슨 의미인지 모르겠다

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i % w == w - 1) //조건식 1 이해가 안됨
                System.out.println();
        }
        if (n % w != 0) // 조건식 2 이해가 안됨
            System.out.println();
    }

}
