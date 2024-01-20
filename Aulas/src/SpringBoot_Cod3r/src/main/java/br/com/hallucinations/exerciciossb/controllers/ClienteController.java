package br.com.hallucinations.exerciciossb.controllers;

import br.com.hallucinations.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28,"Pedro","123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorID1(@PathVariable int id){
        return new Cliente(id,"Maria","987.654.321-00");
    }
    @GetMapping
    public Cliente obterClienterPorId2(@RequestParam(name = "id",defaultValue = "1",required = false) int id){
        return new Cliente(id,"João Augusto", "111.222.333-44");
    }
}