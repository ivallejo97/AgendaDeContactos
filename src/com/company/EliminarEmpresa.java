package com.company;

import java.util.Scanner;

public class EliminarEmpresa {
    void mostrar(ContactoEmpresa contactoEmpresa) {
        System.out.println("----------------------");
        System.out.println("|  ELIMINAR EMPRESA  |");
        System.out.println("----------------------");

        Scanner eliminar = new Scanner(System.in);
        System.out.print("Esta seguro de que quiere eliminar este contacto(S/N): ");
        String continuar = eliminar.next();

        if (continuar.equals("s") || continuar.equals("S")) {
            contactoEmpresa.id = null;

            contactoEmpresa.nombreE = null;

            contactoEmpresa.telefonoE = null;

            contactoEmpresa.correoE = null;

            contactoEmpresa.ubicacion = null;

            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("La empresa con id " + contactoEmpresa.id + "y nombre " + contactoEmpresa.nombreE + "se ha eliminado");
        } else if(continuar.equals("n") || continuar.equals("N")){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("No se ha eliminado ninguna empresa");
        }


        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpc("Que desea hacer ahora:");
        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"Eliminar Empresa","Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaEliminarEmpresa pantallaEliminarEmpresa = new PantallaEliminarEmpresa();
            pantallaEliminarEmpresa.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }


    }
}
