package com.test.providerserver.service;


import org.apache.dubbo.config.annotation.DubboService;


import org.springframework.stereotype.Service;

@DubboService
@Service
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "ticket";
    }
}
