/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tla.cursoapis.service;

import com.tla.cursoapis.entity.EstadoProducto;
import com.tla.cursoapis.entity.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Juan
 */
public interface ProductoService {
    Producto registarProducto(Producto producto);
    List<Producto> listarProductos();
    Optional<Producto> buscarPorNombre(String nombre);
    Optional<Producto> buscarPorId(Long idProducto);
    Producto actualizarProducto(Long idProducto,Producto producto);
    void eliminarProducto(Long idProducto);
    Producto cambiarEstadoProducto(Long idProducto, EstadoProducto nuevoEstadoProducto);
    List<Producto> obtenerProductosPorEstado(EstadoProducto estadoProducto);
}
