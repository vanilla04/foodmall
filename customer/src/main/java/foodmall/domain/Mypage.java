package foodmall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Mypage_table")
@Data
public class Mypage {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long orderId;
        private Long customerId;
        private Long foodId;
        private Integer qty;
        private Long storeId;
        private String address;
        private String status;


}
