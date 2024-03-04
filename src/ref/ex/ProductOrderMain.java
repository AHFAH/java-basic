package ref.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrder(orders);

        int sum = getTotalAmount(orders);

        System.out.println("총 결제 금액: " + sum);
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
