package br.com.letscode.emailservicesapi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class EmailServices {

    @Autowired
    private JavaMailSender mailSender;


    public void sendMessage(String to, String text, String subject){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("letscodebank@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }
}
