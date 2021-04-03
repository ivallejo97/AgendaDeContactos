package com.company;

import java.util.Scanner;

public class EditarEmpresa {

    void mostrar(ContactoEmpresa contactoEmpresa) {
        System.out.println("--------------------");
        System.out.println("|  EDITAR EMPRESA  |");
        System.out.println("--------------------");

        CampoObligatorio campoObligatorio = new CampoObligatorio();

        contactoEmpresa.id = campoObligatorio.pedir("Nueva id de la empresa", true);

        contactoEmpresa.nombreE = campoObligatorio.pedir("Nuevo nombre nombre de la empresa:", true);

        contactoEmpresa.telefonoE = campoObligatorio.pedir("Nuevo numero de telefono de la empresa:", true);

        contactoEmpresa.correoE = campoObligatorio.pedir("Nuevo correo electronico de la empresa:");

        contactoEmpresa.ubicacion = campoObligatorio.pedir("Nueva ubicacion de la empresa:");

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarInfo("El contacto se ha actualizado correctamente");

        Mensaje mensaje1 = new Mensaje();
        mensaje1.mostrarOpc("Que desea hacer ahora:");
        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"Editar Contacto", "Editar empresa", "Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaEditarContacto pantallaEditarContacto = new PantallaEditarContacto();
            pantallaEditarContacto.mostrar();
        } else if("2".equals(opcion)){
            PantallaEditarEmpresa pantallaEditarEmpresa = new PantallaEditarEmpresa();
            pantallaEditarEmpresa.mostrar();
        } else if ("3".equals(opcion)) {
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }
    }
}