package foodmall.domain;

import foodmall.domain.*;
import foodmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long custormerId;
    private Long foodId;
    private Integer qty;
    private Long storeId;
    private String address;
    private String status;

    public OrderAccepted(Cook aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
