package com.company;

public class PantallaEliminar {
    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("    ELIMINAR CONTACTO   ");

        Menu menu = new Menu();
        String[] opciones = {"Eliminar contacto", "Eliminar Empresa", "Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaEliminarContacto pantallaEliminarContacto = new PantallaEliminarContacto();
            pantallaEliminarContacto.mostrar();
        } else if ("2".equals(opcion)) {
           PantallaEliminarEmpresa pantallaEliminarEmpresa = new PantallaEliminarEmpresa();
           pantallaEliminarEmpresa.mostrar();
        } else if ("3".equals(opcion)) {
            return false;
        }
        return true;
    }
}