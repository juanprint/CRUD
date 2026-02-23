/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tla.cursoapis.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Genera los getters y setters
@Data
//Contructor con todos los campos
@AllArgsConstructor
//Constructor sin campos
@NoArgsConstructor
/**
 *
 * @author Juan
 */
public class Message {
    private int id;
    private String content;
}
