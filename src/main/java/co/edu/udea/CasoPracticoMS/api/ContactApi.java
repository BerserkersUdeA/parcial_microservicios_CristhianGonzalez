package co.edu.udea.CasoPracticoMS.api;

import co.edu.udea.CasoPracticoMS.dto.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping("/contact")
    public Contact newContact(){
        return new Contact(1006130480L,"Cristhian", "Gonzalez", "+57 3142564668", "cristhian.gonzalez@udea.edu.co");
    }
}
