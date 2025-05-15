package JAVA_ALGORITHM;

// 3개의 정숫값을 입력하고 최댓값을 구하여 출력하기

import java.util.Scanner; //전체 프로그램 앞머리(클래스 선언보다 앞)에 작성하기

public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값: "); int a = stdIn.nextInt();
        System.out.print("b의 값: "); int b = stdIn.nextInt();
        System.out.print("c의 값: "); int c = stdIn.nextInt();

        int max = a; //max에 a값을 넣는다
        if (b > max) max = b; //b값이 max보다 크면 max에 b를 넣는다
        if (c > max) max = c; //c값이 max보다 크면 max에 c를 넣는다

        //a, b, c의 최댓값을 구하여 max에 대입하기

        System.out.println("최댓값은" + max + "입니다.");
    }

}

