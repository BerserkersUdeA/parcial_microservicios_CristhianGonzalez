package co.edu.udea.CasoPracticoMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
    @GetMapping("/")
    public String viewHomePage(){
        return "Parcial Final MicroServicios - Cristhian Gonzalez";
    }

    @GetMapping("/hello")
    public String viewHomePage2(){
        return "Hola mundo desde Spring Boot!!";
    }
}
