package JAVA_ALGORITHM.PART1;

// 1부터 10까지의 합을 가우스 덧셈으로 나타내기
// 예를 들어, (1+10)*5
import java.util.Scanner;

public class SumForPractice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        int n = stdIn.nextInt();

        int sum = (1+n)*n/2;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다." );
    }
}
