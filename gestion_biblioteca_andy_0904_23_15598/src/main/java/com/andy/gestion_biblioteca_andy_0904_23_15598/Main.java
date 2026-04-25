/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.andy.gestion_biblioteca_andy_0904_23_15598;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("1. Agregar libro");
            System.out.println("2. Ver libros");
            System.out.println("3. Buscar por titulo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    try {
                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Año de publicacion: ");
                        int año = Integer.parseInt(sc.nextLine());

                        biblioteca.agregarLibro(new Libro(titulo, autor, año));

                        System.out.println("Libro agregado correctamente.");

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("LISTA DE LIBROS");

                    if (biblioteca.obtenerLibros().isEmpty()) {
                        System.out.println("No hay libros registrados.");
                    } else {
                        for (Libro libro : biblioteca.obtenerLibros()) {
                            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese titulo a buscar: ");
                    String tituloBusqueda = sc.nextLine();

                    List<Libro> resultados = biblioteca.buscarPorTitulo(tituloBusqueda);

                    System.out.println("RESULTADOS");

                    if (resultados.isEmpty()) {
                        System.out.println("No se encontró ningún libro.");
                    } else {
                        for (Libro libro : resultados) {
                            System.out.println(libro.getTitulo() + " - " + libro.getAutor());
                        }
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}