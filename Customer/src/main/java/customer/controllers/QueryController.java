package customer.controllers;

import customer.domain.Tab;
import customer.events.ParentEvent;
import customer.events.TabCreated;
import customer.recieverAndSender.Receiver;
import org.apache.kafka.common.network.Receive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/query/")
public class QueryController {


   @Autowired
   Receiver receiver;
    @GetMapping(value="/message")
    public List<ParentEvent> message(){
        return receiver.list;
    }
}
