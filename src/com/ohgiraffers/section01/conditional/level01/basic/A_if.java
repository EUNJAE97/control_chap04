package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class A_if {

    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num >= 0) {
            System.out.println("양수다.");
        }else {
            System.out.println("양수가 아니다.");
        }
    }
}
