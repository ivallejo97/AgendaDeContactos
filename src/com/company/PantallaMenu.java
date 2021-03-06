package com.company;

import java.io.File;
import java.util.Scanner;

public class PantallaMenu {

    boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("  AGENDA DE CONTACTOS   ");

        Menu menu = new Menu();
        String[] opciones = {"Crear Contacto", "Mostrar Contactos", "Buscar Contactos", "Editar Contactos", "Eliminar Contacto", "Salir"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
        } else if("2".equals(opcion)){
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
        } else if("3".equals(opcion)) {
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar();
        } else if("4".equals(opcion)){
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
        }  else if("5".equals(opcion)) {
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
        } else if("6".equals(opcion)){
            return false;
        }
        return true;
    }
}