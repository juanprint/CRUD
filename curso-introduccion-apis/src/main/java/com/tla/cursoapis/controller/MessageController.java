/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tla.cursoapis.controller;

import com.tla.cursoapis.entity.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @GetMapping("/{id}")//recibe el id y lo pasa como parametro 
                                     //variablde la ruta
    public Message obtenerMessagePorId(@PathVariable int id){
                    //transforma a un flujo de datos
        Optional<Message> message=mensajes.stream()
                .filter(m->m.getId()==id)
                .findFirst();
        //retorna message y sino existe devuelve null para eso esta el optional
        return message.orElse(null);
    }
    //Enviar,Crear data
    @PostMapping
    public Message crearMensaje(@RequestBody Message message){
        mensajes.add(message);
        return message;
    }
    @DeleteMapping("/{id}")
    public void eliminarMensaje(@PathVariable int id){
                //elimar si esta...
        mensajes.removeIf(m->m.getId()==id);
    }
}
