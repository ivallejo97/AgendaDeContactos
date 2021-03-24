package com.company;

import java.util.Scanner;

public class EliminarContacto {
    void mostrar(Contacto contacto) {
        System.out.println("-----------------------");
        System.out.println("|  ELIMINAR CONTACTO  |");
        System.out.println("-----------------------");

        Scanner eliminar = new Scanner(System.in);
        System.out.print("Esta seguro de que quiere eliminar este contacto(S/N): ");
        String continuar = eliminar.next();

           if (continuar.equals("s") || continuar.equals("S")){
               contacto.nombre = null;

               contacto.apellido = null;

               contacto.correo = null;

               contacto.telefono = null;

               Mensaje mensaje = new Mensaje();
               mensaje.mostrarInfo("El contacto" + contacto.nombre + contacto.apellido + "se ha eliminado correctamente");

           } else if(continuar.equals("n") || continuar.equals("N")){
               Mensaje mensaje = new Mensaje();
               mensaje.mostrarInfo("No se ha eliminado ningun contacto");
           }


        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpc("Que desea hacer ahora:");
        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"Eliminar contacto","Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaEliminarContacto pantallaEliminarContacto = new PantallaEliminarContacto();
            pantallaEliminarContacto.mostrar();
        } else if ("2".equals(opcion)) {
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }

    }
}
//