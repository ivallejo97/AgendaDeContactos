package com.company;

public class PantallaEditar {
    void mostrar() {
        System.out.println("---------------------");
        System.out.println("|  EDITAR CONTACTO  |");
        System.out.println("---------------------");

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
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();

        }
    }
}
//