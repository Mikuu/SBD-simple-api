package sbd.simple.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sbd.simple.api.model.Tickets;
import sbd.simple.api.util.Init;

@RestController
public class Controller {
    private Init init = new Init();

    @RequestMapping(value = "/otn/board/init", produces = "text/html;charset=UTF-8")
    public String init() {
        return this.init.getContent();
    }

    @RequestMapping(value = "/otn/board/query", produces = "application/json;charset=UTF-8")
    public Tickets getTickets() {
        return new Tickets();
    }

}
