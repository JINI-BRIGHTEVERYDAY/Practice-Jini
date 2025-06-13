package JAVA_ALGORITHM.PART1;

import java.util.Scanner;

public class JudgeSign3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하시오.");
        int n = stdIn.nextInt();

        if (n == 1)
            System.out.println("A");

        else if (n == 2)
            System.out.println("B");

        else
            ;

        // else절에서는 아무 것도 수행하지 않고 끝난다
    }
}

// a = (x > y) ? x : y ?
// System.out.println((c == 0) ? "c는 0" : "c는 0이 아님");
