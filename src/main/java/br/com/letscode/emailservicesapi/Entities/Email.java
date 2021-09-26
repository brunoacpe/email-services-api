package br.com.letscode.emailservicesapi.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class Email {
    private String email_user;
    private String message;
    private String subject;
}
