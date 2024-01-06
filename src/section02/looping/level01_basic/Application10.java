package section02.looping.level01_basic;

import java.util.Scanner;

public class Application10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.println("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                answer += ch;
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch + num > 'z') {
                    answer += (char) (ch - 26 + num);
                } else {
                    answer += (char) (ch + num);
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch + num > 'Z') {
                    answer += (char) (ch - 26 + num);
                } else {
                    answer += (char) (ch + num);
                }

            }

        }
        System.out.println(answer);
    }

}