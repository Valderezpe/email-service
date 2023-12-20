package com.valderez.br.service.email.adapters;

public interface EmailGatewaySender {
    void sendEmail(String to, String subject, String body);
}
