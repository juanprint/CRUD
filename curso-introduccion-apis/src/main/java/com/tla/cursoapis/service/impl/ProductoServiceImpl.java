/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tla.cursoapis.service.impl;

import com.tla.cursoapis.entity.EstadoProducto;
import com.tla.cursoapis.entity.Producto;
import com.tla.cursoapis.repository.ProductoRepository;
import com.tla.cursoapis.service.ProductoService;
import java.util.List;
import java.util.Optional;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Juan
 */
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    //La cual se comunica con la bd utilizando jpa/hibernate
    private ProductoRepository productoRepository;
    
    @Override
    public Producto registarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> buscarPorNombre(String nombre) {
        return productoRepository.findByNombreProducto(nombre);
    }

    @Override
    public Optional<Producto> buscarPorId(Long idProducto) {
        return productoRepository.findById(idProducto);
    }

    @Override
    //No se declara un throws o try catch, permite lanzar la excepcion sin declararla o capturarla
    @SneakyThrows
    public Producto actualizarProducto(Long idProducto, Producto producto) {
        Producto productoExistente = productoRepository.findById(idProducto)
                .orElseThrow(()->new Exception("Producto con ID "+idProducto+" no encontrado"));
        productoExistente.setNombreProducto(producto.getNombreProducto());
        productoExistente.setDescription(producto.getDescription());
        productoExistente.setPrecio(producto.getPrecio());
        productoExistente.setCantidad(producto.getCantidad());
        productoExistente.setEstadoProducto(producto.getEstadoProducto());
        return productoRepository.save(productoExistente);
    }

    @Override
    @SneakyThrows
    public void eliminarProducto(Long idProducto) {
        productoRepository.findById(idProducto)
                .orElseThrow(()->new Exception("Producto con ID "+idProducto+" no encontrado"));
        productoRepository.deleteById(idProducto);
    }


    @Override
    @SneakyThrows
    public Producto cambiarEstadoProducto(Long idProducto, EstadoProducto nuevoEstadoProducto) {
        Producto productoExistente=productoRepository.findById(idProducto)
                .orElseThrow(()->new Exception("Producto con ID "+idProducto+" no encontrado"));
        productoExistente.setEstadoProducto(nuevoEstadoProducto);
        return productoRepository.save(productoExistente);
    }

    @Override
    public List<Producto> obtenerProductosPorEstado(EstadoProducto estadoProducto) {
        return productoRepository.findByEstadoProducto(estadoProducto);
    }
    
}
