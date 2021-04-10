package com.company;

import java.util.Scanner;

public class EliminarContacto {
    boolean mostrar(Contacto contacto) {
        Titulo titulo = new Titulo();
        titulo.mostrar("    ELIMINAR CONTACTO   ");

        Scanner eliminar = new Scanner(System.in);
        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpc("Esta seguro de que quiere eliminar este contacto(S/N): ");
        String continuar = eliminar.next();

           if (continuar.equals("s") || continuar.equals("S")){
               contacto.nombre = null;

               contacto.apellido = null;

               contacto.correo = null;

               contacto.telefono = null;

               mensaje.mostrarInfo("El contacto se ha eliminado correctamente");

           } else if(continuar.equals("n") || continuar.equals("N")){
               mensaje.mostrarInfo("No se ha eliminado ningun contacto");
           }

        System.out.println();
        mensaje.mostrarOpc("Que desea hacer ahora:");

        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"Eliminar contacto", "Eliminar empresa", "Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaEliminarContacto pantallaEliminarContacto = new PantallaEliminarContacto();
            pantallaEliminarContacto.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaEliminarEmpresa pantallaEliminarEmpresa = new PantallaEliminarEmpresa();
            pantallaEliminarEmpresa.mostrar();
        }else if ("3".equals(opcion)) {
            return false;
        }
        return true;

    }
}