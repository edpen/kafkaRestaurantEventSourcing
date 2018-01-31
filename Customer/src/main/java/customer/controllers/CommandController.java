package customer.controllers;

import customer.domain.Tab;
import customer.events.ParentEvent;
import customer.events.TabClosed;
import customer.events.TabCreated;
import customer.recieverAndSender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value="/command/")
public class CommandController {
    @Autowired
    Sender sender;

@PostMapping(value="/openTab")
    public ParentEvent openTab(){
    TabCreated tab=new TabCreated(/*UUID.randomUUID()*/);
    //Tab tab=new Tab();
    sender.send(tab);
    return tab;
}
    @PostMapping(value="/closeTab")
    public ParentEvent closeTab(){
        TabClosed tab=new TabClosed("close it");
        //Tab tab=new Tab();
        sender.send(tab);
        return tab;
    }

}
