package section02.looping.level01_basic;

import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print("수");
            }else {
                System.out.print("박");
            }

        }
    }
}
