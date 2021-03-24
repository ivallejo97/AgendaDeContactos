package com.company;

public class PantallaBuscar {
    void mostrar() {
        System.out.println("---------------------");
        System.out.println("|  BUSCAR CONTACTO  |");
        System.out.println("---------------------");

        Menu menu = new Menu();
        String[] opciones = {"Buscar contacto", "Buscar Empresa", "Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaBuscarContacto pantallaBuscarContacto = new PantallaBuscarContacto();
            pantallaBuscarContacto.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaBuscarEmpresa pantallaBuscarEmpresa = new PantallaBuscarEmpresa();
            pantallaBuscarEmpresa.mostrar();
        } else if ("3".equals(opcion)) {
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();

        }
    }
}
