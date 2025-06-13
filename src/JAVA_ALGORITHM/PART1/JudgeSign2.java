package JAVA_ALGORITHM.PART1;

import java.util.Scanner;

public class JudgeSign2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하시오.");
        int n = stdIn.nextInt();

        if (n == 1)
            System.out.println("A");

        else if (n == 2)
            System.out.println("B");

        else
            System.out.println("C");

        //else if (n == 3)
        //   System.out.println("C");
    }
}
