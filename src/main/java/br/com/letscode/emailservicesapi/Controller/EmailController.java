package br.com.letscode.emailservicesapi.Controller;


import br.com.letscode.emailservicesapi.Entities.Email;
import br.com.letscode.emailservicesapi.Service.EmailServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {


    @Autowired
    private EmailServices services;

    @PostMapping(consumes="application/json")
    public ResponseEntity<Void> sendEmail(@RequestBody Email email){
        services.sendMessage(email.getEmail_user(),email.getMessage(), email.getSubject());
        return ResponseEntity.status(200).build();
    }
}
