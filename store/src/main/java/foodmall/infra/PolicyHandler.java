package foodmall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import foodmall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import foodmall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired CookRepository cookRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_OrderInfoCopy(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener OrderInfoCopy : " + orderPlaced + "\n\n");


        

        // Sample Logic //
        Cook.orderInfoCopy(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_UpdateStatus(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener UpdateStatus : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        Cook.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_UpdateStatus(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener UpdateStatus : " + paid + "\n\n");


        

        // Sample Logic //
        Cook.updateStatus(event);
        

        

    }

}


