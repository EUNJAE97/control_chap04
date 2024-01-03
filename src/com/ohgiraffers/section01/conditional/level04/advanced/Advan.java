package com.ohgiraffers.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Advan {

    public void level04Ad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요 : ");
        int lang = sc.nextInt();
        System.out.println("영어 점수를 입력하세요 : ");
        int eng = sc.nextInt();
        System.out.println("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();

        int aver = (math + eng + lang) / 3;

        if (math >= 40 && lang >= 40 && eng >= 40) {
            System.out.println("합격입니다!");
        } else if (math >= 40 && lang <= 40 && eng >= 40) {
            System.out.println("국어 점수 미달로 불합격 입니다.");

        } else if (math >= 40 && lang >= 40 || eng <= 40) {
            System.out.println("영어 점수 미달로 불합격 입니다.");
        } else if (math <= 40 && lang >= 40 && eng >= 40) {
            System.out.println("수학 점수 미달로 불합격 입니다.");

        }else {
            System.out.println("평균 점수 미달로 불합격 입니다.");
        }
// 집가서 다시 해보기 ****
    }
}