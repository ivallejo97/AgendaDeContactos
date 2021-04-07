package com.company;

public class PantallaEditar {
    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("     EDITAR CONTACTO    ");

        Menu menu = new Menu();
        String[] opciones = {"Editar contacto", "Editar Empresa", "Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaEditarContacto pantallaEditarContacto = new PantallaEditarContacto();
            pantallaEditarContacto.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaEditarEmpresa pantallaEditarEmpresa = new PantallaEditarEmpresa();
            pantallaEditarEmpresa.mostrar();
        } else if ("3".equals(opcion)) {
            return false;
        }
        return true;
    }
}