package level2.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {
        if (itemCount == 0) {
            System.out.println("장바구니에 상품이 없습니다.");
            return;
        }

        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() + ", 합계 : " + item.getPriceSum());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getPriceSum();
        }
        return totalPrice;
    }
}
