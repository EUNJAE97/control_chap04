package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class B_method {

    public void bmiCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("신장을 입력하세요.");
        double height = sc.nextDouble();

        System.out.println("체중을 입력하세요.");
        int weight = sc.nextInt();

        double bmi = weight / (height * height);
        String grade = "";

        if (bmi < 20) {
            grade = "저체중";

        } else if (bmi > 20 && bmi < 25) {
            grade = "정상체중";

        } else if (bmi > 25 && bmi < 30) {
            grade = "과체중";

        } else if (bmi > 30){
            grade = "비만";

        }
        System.out.println("당신은 " + grade + "입니다.");
    }
}
