package poly.ex.pay1;

import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PayService payService = new PayService();

        while(true){
            System.out.print("결제 수단을 선택하세요.(kakao 혹은 naver. 종료를 원할시 exit): ");
            String option = input.nextLine();

            if(option.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요: ");
            int amount = input.nextInt();
            input.nextLine();

            payService.processPay(option, amount);
        }


    }
}
