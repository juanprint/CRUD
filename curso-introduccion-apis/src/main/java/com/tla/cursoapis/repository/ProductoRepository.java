/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tla.cursoapis.repository;

import com.tla.cursoapis.entity.EstadoProducto;
import com.tla.cursoapis.entity.Producto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan
 */
//La cual se comunica con la bd utilizando jpa/hibernate
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Optional<Producto> findByNombreProducto(String nombreProducto);
    Optional<Producto> findByProducto(Long idProducto);
    List<Producto> findByEstadoProducto(EstadoProducto estadoProducto);
}


