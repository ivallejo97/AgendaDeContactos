package com.company;

import java.util.Scanner;

public class EliminarEmpresa {
    boolean mostrar(ContactoEmpresa contactoEmpresa) {
        Titulo titulo = new Titulo();
        titulo.mostrar("    ELIMINAR EMPRESA    ");

        Scanner eliminar = new Scanner(System.in);
        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpc("Esta seguro de que quiere eliminar este contacto(S/N): ");
        String continuar = eliminar.next();

        if (continuar.equals("s") || continuar.equals("S")) {
            contactoEmpresa.id = null;

            contactoEmpresa.nombreE = null;

            contactoEmpresa.telefonoE = null;

            contactoEmpresa.correoE = null;

            contactoEmpresa.ubicacion = null;

            mensaje.mostrarInfo("La empresa se ha eliminado correctamente");
        } else if(continuar.equals("n") || continuar.equals("N")){
            mensaje.mostrarInfo("No se ha eliminado ninguna empresa");
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
        } else if ("3".equals(opcion)) {
            return false;
        }
        return true;
    }
}