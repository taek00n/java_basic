package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createProductOrder("두부", 2000, 2);
        productOrders[1] = createProductOrder("김치", 5000, 1);
        productOrders[2] = createProductOrder("콜라", 1500, 2);

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createProductOrder(String prodectName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = prodectName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += (productOrder.price * productOrder.quantity);
        }
        return totalAmount;
    }
}
