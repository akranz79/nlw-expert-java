package com.rocketseat.certification_nlw;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/retornarPrimeiraController")
    public Usuario retornoPrimeiraController() {
        var usuario = new Usuario("Alexandre",34);
        return usuario;
    }

    @PostMapping("/meuPrimeiroPost")
    public String primeiroPost() {
        return "Meu primeiro POST";
    }
        

    record Usuario(String nome, int idade){

    }
  
}