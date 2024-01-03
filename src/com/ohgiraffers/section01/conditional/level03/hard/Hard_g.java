package com.ohgiraffers.section01.conditional.level03.hard;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Hard_g {

    public void hardLevel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        int num = 0;

        switch (op) {

            case '+':
                num = first + second;
                break;
            case '-':
                num = first - second;
                break;
            case '*':
                num = first * second;
                break;
            case '/':
                num = first / second;
                break;
            case '%':
                num = first % second;
                break;
            default:
                System.out.println("입력하신 연산은 없습니다.");
                System.out.println("프로그램을 종료합니다...");
                return; //메소드를 종료한다.
        }

        System.out.println(first + " " + op + " " + second + " = " + num);
    }

    public void hardTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사과 바나나 복숭아 키위");
             System.out.println(" ==================== ");
        System.out.print("과일 이름을 입력하세요 : ");
        String sweet = sc.next();
        int price = 0;
        String name = "";
        switch (sweet) {
            case "사과":
                name = "사과";
                price = 1000;
                break;
            case "바나나":
                name = "바나나";
                price = 3000;
                break;
            case "복숭아":
                name = "복숭아";
                price = 2000;
                break;
            case "키위":
                name = "키위";
                price = 5000;
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
                return;
        }
        System.out.println(name + "의 가격은 " + price + "입니다.");

    }
}
