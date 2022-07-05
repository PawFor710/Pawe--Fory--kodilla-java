package Food2Door;

import java.time.LocalDateTime;

public interface OrderingRepository {

    boolean createOrder(User user, Product product, Producer producer, LocalDateTime orderedTime);
}
