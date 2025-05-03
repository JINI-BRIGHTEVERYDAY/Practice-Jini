package JAVA_ALGORITHM;

import java.util.Scanner;

// 1,2, ... , n의 합과 그 값을 구하는 과정을 출력하기
public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();

        } while(n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }

        // 중간 과정 for 문에서 1부터 n-1까지의 값 뒤에 +를 출력한다

        System.out.print(n + " = ");
        sum += n;
        System.out.println(sum);

        // 마지막 과정: n값 뒤에 =와 합계를 출력한다

        // System.out.println(n + " = " + (sum += n));
    }
}
