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

    // ✔ agregar libro con validación
    public void agregarLibro(Libro libro) {
        if (libro == null) {
            throw new IllegalArgumentException("El libro no puede ser null");
        }
        libros.add(libro);
    }

    // ✔ devuelve copia (no la lista original)
    public List<Libro> obtenerLibros() {
        return new ArrayList<>(libros);
    }

    // ✔ NUNCA devuelve null (esto era tu error principal)
    public List<Libro> buscarPorTitulo(String titulo) {

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede ser null ni vacío");
        }

        List<Libro> resultados = new ArrayList<>();

        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultados.add(libro);
            }
        }

        return resultados;
    }
}