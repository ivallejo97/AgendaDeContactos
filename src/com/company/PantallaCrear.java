package com.company;
import java.lang.Thread;
import java.util.Scanner;


public class PantallaCrear {

    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("     CREAR CONTACTO     ");

        Menu menu = new Menu();
        String[] opciones = {"Crear contacto", "Crear Empresa", "Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            CrearContacto crearContacto = new CrearContacto();
            crearContacto.mostrar();
        } else if ("2".equals(opcion)) {
            CrearEmpresa crearEmpresa = new CrearEmpresa();
            crearEmpresa.mostrar();
        } else if ("3".equals(opcion)) {
            return false;
        }
        return true;
    }
}