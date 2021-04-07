package com.company;

public class PantallaBuscar {
    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("     BUSCAR CONTACTO    ");

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
            return false;
        }
        return true;
    }
}
