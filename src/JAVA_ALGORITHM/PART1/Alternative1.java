package JAVA_ALGORITHM.PART1;

// + 와 -를 번갈아 출력

import java.util.Scanner;

public class Alternative1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개 출력합니다. ");

        // 변수 n값을 읽어들이는 코드가 필요함

        System.out.print("n값: ");
        n = stdIn.nextInt(); // 사용자로부터 입력 받는 코드 추가


        for (int i = 0; i < n; i++)
            if (i % 2 == 0)
                System.out.println("+");
            else
                System.out.println("-");

            stdIn.close();
            // 리소스 정리 (선택사항이지만 좋은 습관이 될 수 있다)


    }
}

// 반복할 때마다 if문 실행해야 한다.
// 다시 말해서, for 문을 반복할 때마다 if문을 실행하여야 한다.
// 따라서, i값이 홀수인지 알아내기 위해서 if문을 n번 실행해야 하는데, 이것이 매우 불필요하다
// 변경될 때 유연하게 대응하기가 어렵다

//for (int i = 1; i <= n; i++)
    //if (i % 2 ==0)
        //System.out.print("-");
    //else
        //System.out.print("+");