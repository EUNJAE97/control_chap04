package section02.looping.level01_basic;

import java.util.Scanner;

public class Application11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("받으신 금액을 입력하세요 : ");
        int money = sc.nextInt();
        System.out.println("상품 가격을 입력하세요 : ");
        int price = sc.nextInt();

        int change = money - price;
        int currency = 50000;
        int mok = 0;
        int nmg = 0;
        int sw = 0;
        int temp = change;
        // 왜 change를 temp에 넣는지
        System.out.println("---------------------");
        while(true) {
            mok = temp / currency;
            nmg = temp % currency;
            if (mok == 0 && nmg == 0) {
                break;
            }
            if (mok != 0) {
                if (currency > 500)
                    System.out.println(currency + "원권 지폐" + mok + "장");
                else
                    System.out.println(currency + "원권 동전" + mok + "개");
            }
            if(sw == 0) {
                sw = 1;
                currency /= 5;
            } else {
                sw = 0;
                currency /= 2;
            }

            temp = nmg;
        }

        System.out.println("=========================");
        System.out.println("거스름돈 : " + change + "원");
    }

}

