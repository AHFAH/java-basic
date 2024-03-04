package class1.classEx;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] order = new ProductOrder[3];

        ProductOrder od1 = new ProductOrder();
        od1.productName = "두부";
        od1.price = 2000;
        od1.quantity = 2;

        ProductOrder od2 = new ProductOrder();
        od2.productName = "김치";
        od2.price = 5000;
        od2.quantity = 1;

        ProductOrder od3 = new ProductOrder();
        od3.productName = "콜라";
        od3.price = 1500;
        od3.quantity = 2;

        order[0] = od1;
        order[1] = od2;
        order[2] = od3;

        int sum = 0;

        for(ProductOrder po : order){
            System.out.println("상품명: " + po.productName + ", 가격: " + po.price + ", 수량: " + po.quantity);
            sum += po.price * po.quantity;
        }

        System.out.println("총 결제 금액: " + sum);
    }
}
