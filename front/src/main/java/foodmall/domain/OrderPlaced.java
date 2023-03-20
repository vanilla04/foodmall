package foodmall.domain;

import foodmall.domain.*;
import foodmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private Long customerId;
    private Long foodId;
    private Integer qty;
    private Long storeId;
    private String address;
    private String status;

    public OrderPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
