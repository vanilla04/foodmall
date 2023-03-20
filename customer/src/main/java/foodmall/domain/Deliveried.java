package foodmall.domain;

import foodmall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Deliveried extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String address;
    private String status;
}
