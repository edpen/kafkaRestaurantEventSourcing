package customer.controllers;

import customer.events.KafkaSender;
import customer.events.TabCreated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value="/command/")
public class CommandController {
    @Autowired
    KafkaSender kafkaSender;


@PostMapping(value="/openTab")
    public TabCreated openTab(){
    TabCreated tab=new TabCreated(UUID.randomUUID());
    kafkaSender.send(tab.toString());
    return tab;
}
}
