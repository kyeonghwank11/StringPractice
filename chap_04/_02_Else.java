package chap_04;

import org.w3c.dom.ls.LSOutput;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        // int hour = 10;
        int hour = 15;
        if (hour < 14) { // 오후 2시 이전이면
            System.out.println("아이스 아메리카노 +1");
        } else {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
        } else { // 그 외의 경우이면
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");


        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hallabongAde = true; // 한라봉 에이드
        boolean mangoJuice = true; // 망고 주스

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 +1");

        // else if 는 여러번 사용 가능 
    }
}
