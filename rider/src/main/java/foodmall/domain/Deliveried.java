package foodmall.domain;

import foodmall.domain.*;
import foodmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Deliveried extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private String status;

    public Deliveried(Delivery aggregate){
        super(aggregate);
    }
    public Deliveried(){
        super();
    }
}
