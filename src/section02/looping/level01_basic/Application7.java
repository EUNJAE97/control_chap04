package section02.looping.level01_basic;

import java.util.Scanner;

public class Application7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("2보다 큰 정수를 하나 입력하세요 : ");
            int first = sc.nextInt();
            if (first > 2) {
                for (int i = 2; i <= first; i++) {
                    if (first % i == 1) {
                        System.out.println("소수다.");
                        break;
                    } else {
                        System.out.println("소수가 아니다.");
                        break;
                    }
                } break;
            } else {
                System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");

            }

        }
    }
}









