package foodmall.domain;

import foodmall.domain.OrderAccepted;
import foodmall.domain.OrderRejected;
import foodmall.domain.CookStarted;
import foodmall.domain.CookFinished;
import foodmall.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Cook_table")
@Data

public class Cook  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private Long custormerId;
    
    
    
    
    
    private Long foodId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private Long storeId;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){
    }
    @PostUpdate
    public void onPostUpdate(){


        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();



        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();



        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }

    public static CookRepository repository(){
        CookRepository cookRepository = StoreApplication.applicationContext.getBean(CookRepository.class);
        return cookRepository;
    }




    public static void orderInfoCopy(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Cook cook = new Cook();
        repository().save(cook);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(cook->{
            
            cook // do something
            repository().save(cook);


         });
        */

        
    }
    public static void updateStatus(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        Cook cook = new Cook();
        repository().save(cook);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(cook->{
            
            cook // do something
            repository().save(cook);


         });
        */

        
    }
    public static void updateStatus(Paid paid){

        /** Example 1:  new item 
        Cook cook = new Cook();
        repository().save(cook);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(cook->{
            
            cook // do something
            repository().save(cook);


         });
        */

        
    }


}
