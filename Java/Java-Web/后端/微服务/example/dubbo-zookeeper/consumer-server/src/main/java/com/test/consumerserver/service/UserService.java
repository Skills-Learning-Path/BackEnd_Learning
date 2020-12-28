package com.test.consumerserver.service;


import org.apache.dubbo.config.annotation.DubboReference;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    //想拿到provider的票
    @DubboReference
    TicketService TICKET_SERVICE;

    public void buyTicket(){
        String ticket = TICKET_SERVICE.getTicket();
        System.out.println(ticket);
    }

}
