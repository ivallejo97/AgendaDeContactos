package com.company;

public class PantallaEliminar {
    void mostrar() {
        System.out.println("-----------------------");
        System.out.println("|  ELIMINAR CONTACTO  |");
        System.out.println("-----------------------");

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
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();

        }
    }
}