package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = input.nextInt();
        input.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for(int i=0; i<n; i++){
            System.out.println(i+1 + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String name = input.nextLine();
            System.out.print("가격: ");
            int price = input.nextInt();
            System.out.print("수량: ");
            int quantity = input.nextInt();
            input.nextLine();

            orders[i] = createOrder(name, price, quantity);
        }

        printOrder(orders);

        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);
    }

    static ProductOrder createOrder(String name, int price, int quantity){
        ProductOrder po = new ProductOrder();
        po.productName = name;
        po.price = price;
        po.quantity = quantity;
        return po;
    }

    static void printOrder(ProductOrder[] orders){
        for(ProductOrder po : orders){
            System.out.println("상품명: " + po.productName + " 가격: " + po.price + " 수량: " + po.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for(ProductOrder po : orders){
            sum += po.price * po.quantity;
        }
        return sum;
    }
}
