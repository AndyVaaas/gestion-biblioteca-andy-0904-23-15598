/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andy.gestion_biblioteca_andy_0904_23_15598;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libro != null) {
            this.libros.add(libro);
        }
    }

    public List<Libro> obtenerLibros() {
        // Devuelve una copia para cumplir con la protección de la lista original
        return new ArrayList<>(this.libros);
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // Retorna null si no lo encuentra
    }
}