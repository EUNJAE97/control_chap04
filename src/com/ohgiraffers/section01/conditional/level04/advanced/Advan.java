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

        if (aver > 40) {
            System.out.println("합격입니다!");
        }
        if (aver <= 40) {
            System.out.println("평균 점수 미달로 불합격입니다.");
        }

        if (lang < 40) {
            System.out.println("국어 점수 미달로 불합격 입니다.");
        }
        if (eng < 40) {
            System.out.println("영어 점수 미달로 불합격 입니다.");
        }
        if (math < 40) {
            System.out.println("수학 점수 미달로 불합격 입니다.");
        }
// 집가서 다시 해보기 ****
    }

    public void level042v() {
        Scanner sc = new Scanner(System.in);
        System.out.println("월 급여 입력 : ");
        int pay = sc.nextInt();
        System.out.println("매출액 입력 : ");
        int bill = sc.nextInt();

        int bonus = 0;

        if (bill >= 50000000) {
            bonus = 5;
        } else if (bill >= 30000000) {
            bonus = 3;
        } else if (bill >= 10000000) {
            bonus = 1;
        } else {
            bill = 0;
        }
        int all = pay + bill / (bonus * 100);
        System.out.println("매출액 : " + bill);
        System.out.println("보너스율 : " + bonus + "%");
        System.out.println("월 급여 : " + pay);
        System.out.println("보너스 금액 : " + bill / (bonus * 100));
        System.out.println("총 급여 : " + all);
    }
}

