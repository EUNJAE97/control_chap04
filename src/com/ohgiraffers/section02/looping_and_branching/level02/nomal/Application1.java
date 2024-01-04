package com.ohgiraffers.section02.looping_and_branching.level02.nomal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String word = sc.nextLine();

        int num = 0;
        while (num < word.length()) {
            char ch = word.charAt(num);
            System.out.println(num + " : " + ch);
            num++;
        }// 아직 이해 잘 안됨
    }
}
