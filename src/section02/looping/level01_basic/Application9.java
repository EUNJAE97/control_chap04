package section02.looping.level01_basic;

import java.util.Scanner;

public class Application9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (!(temp >= 'a' && temp <= 'z' || temp >= 'A' && temp <= 'Z')) {
                System.out.println("영문자가 아닌 문자가 포함 되어 있습니다.");
                return;
            }
        }
        System.out.println("문자 입력 : ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                count++;
            }

        }System.out.println("포함된 갯수 : " + count + "개");
        }
    }
