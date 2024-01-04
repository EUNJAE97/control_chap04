package section02.looping.level01_basic;

import java.lang.module.FindException;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++ ) {
            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);
        }
    }
}
