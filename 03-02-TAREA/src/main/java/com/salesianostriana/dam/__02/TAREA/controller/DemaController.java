package com.salesianostriana.dam.__02.TAREA.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemaController {

    @GetMapping("/public")
    public String publico(){
        return "Endpoint público";
    }

    @GetMapping("secure")
    public String protegido(Authentication auth){
        return "hola" + auth.getDeclaringClass().getName() + "endpoint protegido";
    }
}
