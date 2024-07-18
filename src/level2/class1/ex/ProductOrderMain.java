package level2.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] products = new ProductOrder[3];

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        products[0] = product1;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 3000;
        product2.quantity = 3;
        products[1] = product2;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1000;
        product3.quantity = 5;
        products[2] = product3;

        int priceSum = 0;
        for (ProductOrder product : products) {
            System.out.println("상품명 : " + product.productName + ", 가격 : " + product.price + ", 수량 : " + product.quantity);
            priceSum += (product.price * product.quantity);
        }
        System.out.println("총 결제금액 : " + priceSum);
    }
}
