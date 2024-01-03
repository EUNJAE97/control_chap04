package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class A_method {

    public void normal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num = sc.nextInt();

        if (num >= 1 && num < 10) {
            if (num % 2 != 0) {
                System.out.println("홀수다.");
            }
            if (num % 2 == 0) {
                System.out.println("짝수다.");
        }

        }
        else {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
    }
}
