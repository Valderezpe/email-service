package com.valderez.br.service.email.application;

import com.valderez.br.service.email.adapters.EmailGatewaySender;
import com.valderez.br.service.email.core.EmailSenderUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUser {

    private final EmailGatewaySender emailGatewaySender;

    @Autowired
    public EmailSenderService(EmailGatewaySender emailGateway ){
        this.emailGatewaySender = emailGateway;
    }

    @Override
    public void senderEmail(String to, String subject, String body) {
        this.emailGatewaySender.sendEmail(to, subject, body);
    }
}
