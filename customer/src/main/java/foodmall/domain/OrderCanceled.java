package foodmall.domain;

import foodmall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Long foodId;
    private Integer qty;
    private Long storeId;
    private String address;
    private String status;
}
