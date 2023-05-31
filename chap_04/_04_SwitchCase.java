package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case (명확한 케이스가 있는 경우)

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        int ranking = 3; // 1등
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } // else if (ranking == 3) {
           //  System.out.println("반액 장학금");
         else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");
         
         // Switch Case  문을 이용
         ranking = 1;
         switch (ranking) {
             case 1:
                 System.out.println("전액 장학금");
                 break;
             case 2:
                 System.out.println("반액 장학금");
                 break;
             case 3:
                 System.out.println("반액 장학금");  // case2일 때와 동작이 똑같음
                 break;
             default:
                 System.out.println("장학금 대상 아님");
         }
        System.out.println("조회 완료 #2");


         // case 2 와 3을 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");
    }
}
