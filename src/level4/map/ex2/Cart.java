package level4.map.ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int addQuantity) {
        int existQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existQuantity + addQuantity);
    }

    public void minus(Product product, int minusQuantity) {
        int existQuantity = cartMap.getOrDefault(product, 0);

        int newQuantity = existQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }

    public void printAll() {
        Set<Map.Entry<Product, Integer>> entries = cartMap.entrySet();
        System.out.println("모든 상품 출력");
        for (Map.Entry<Product, Integer> entry : entries) {
            System.out.println("상품 : " + entry.getKey() + ", 수량 : " + entry.getValue());
        }
    }
}
