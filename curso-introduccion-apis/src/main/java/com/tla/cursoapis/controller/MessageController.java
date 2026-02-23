/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tla.cursoapis.controller;

import com.tla.cursoapis.entity.Message;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan
 */
@RestController
//Buena practica
@RequestMapping("/api/messages")
public class MessageController {
    private List<Message> mensajes=new ArrayList<>();
    public MessageController(){
        mensajes.add(new Message(1,"Suscribete"));
        mensajes.add(new Message(2,"Dale like"));
    }
    @GetMapping
    public List<Message> listarMensajes(){
        return mensajes;
    }
}
