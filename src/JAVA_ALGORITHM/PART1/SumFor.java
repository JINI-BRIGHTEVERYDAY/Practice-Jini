package JAVA_ALGORITHM.PART1;

// 1부터 n까지의 합을 구하기
// for문을 사용하여, 1,2,3,4...n까지의 합을 구하기

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다. ");
        System.out.println("n값: ");

        int n = stdIn.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++ )
            sum += i;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

    }
}
