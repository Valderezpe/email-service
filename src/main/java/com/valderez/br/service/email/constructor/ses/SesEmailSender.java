package com.valderez.br.service.email.constructor.ses;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.valderez.br.service.email.adapters.EmailGatewaySender;
import org.springframework.beans.factory.annotation.Autowired;

public class SesEmailSender implements EmailGatewaySender {

    private final AmazonSimpleEmailService amazonSimpleEmailService;
    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}
