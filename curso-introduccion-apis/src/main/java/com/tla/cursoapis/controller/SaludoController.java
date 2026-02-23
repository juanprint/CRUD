/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tla.cursoapis.controller;
//Recibe Solicitudes
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan
 */
//Para Spring sepa que debe escuchar peticiones desde ahi
@RestController
//Configuracmos una URL para todos los metodos del controlador
@RequestMapping

public class SaludoController {
    //Definir que sucede cuando alguien visita esa ruta desde Postman
    @GetMapping
    String saludar(){
        return "Hola mundo :D";
    }
}
