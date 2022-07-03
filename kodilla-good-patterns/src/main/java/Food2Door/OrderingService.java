package Food2Door;

import java.time.LocalDateTime;

public interface OrderingService {

    boolean order(Product product, LocalDateTime orderedTime, Producer producer);
}
