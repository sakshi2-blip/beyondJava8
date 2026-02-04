enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    REFUNDED
}


public class Question8 {

        public static void main(String[] args) {

            System.out.println(processOrderStatus(OrderStatus.PENDING));
            System.out.println(processOrderStatus(OrderStatus.SHIPPED));
            System.out.println(processOrderStatus(OrderStatus.REFUNDED));
        }

        public static String processOrderStatus(OrderStatus status) {

            return switch (status) {

                case PENDING ->
                        "Order is awaiting confirmation.";

                case PROCESSING ->
                        "Order is being prepared.";

                case SHIPPED ->
                        "Order has been dispatched.";

                case DELIVERED ->
                        "Order has been successfully delivered.";

                case CANCELLED ->
                        "Order has been canceled.";

                case REFUNDED -> {
                    // Simulating extra processing
                    String result = "Refund has been issued for the order.";
                    yield result;
                }
            };
        }
    }


