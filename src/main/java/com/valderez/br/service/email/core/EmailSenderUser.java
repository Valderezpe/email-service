package com.valderez.br.service.email.core;

public interface EmailSenderUser {
    void senderEmail(String to, String subject,String body);

}
