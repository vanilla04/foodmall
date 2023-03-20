package foodmall.domain;

import foodmall.domain.*;
import foodmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long custormerId;
    private Long foodId;
    private Integer qty;
    private Long storeId;
    private String address;
    private String status;
}


