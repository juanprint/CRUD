/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tla.cursoapis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Juan
 */
@Entity
@Table(name="Producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {
    @Id
    //Cuando se registro un producto el id se va autoincrementando +1
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    
    @Column(name="nombre_producto",nullable = false,length=100)
    private String nombreProducto;
    
    @Column(name="description")
    private String description;
    
    @Column(name="precio",nullable = false)
    private Double precio;
    
    @Column(name="cantidad",nullable = false)
    private int cantidad;
    
    @Enumerated(EnumType.STRING)
    @Column(name="estado",nullable = false)
    private EstadoProducto estadoProducto;
}
