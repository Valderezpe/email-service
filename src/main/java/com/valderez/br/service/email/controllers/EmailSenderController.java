package com.valderez.br.service.email.controllers;

import com.valderez.br.service.email.application.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController (EmailSenderService emailService){
        this.emailSenderService = emailService;
    }
}
