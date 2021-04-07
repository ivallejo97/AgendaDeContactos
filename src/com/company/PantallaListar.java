package com.company;

import java.util.Scanner;

public class PantallaListar {

    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("  CONTACTOS GUARDADOS   ");

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarInfo("\033[33m" + "Contactos Personales" + "\033[0m");
        for(Contacto contacto: Main.agenda.contactos){
            if (contacto.nombre != null) {
                System.out.print(contacto.nombre + " ");
            }
            if (contacto.apellido != null) {
                System.out.print(contacto.apellido +" ");
            }
            if (contacto.telefono != null){
                System.out.print(contacto.telefono + " ");
            }
            if (contacto.correo != null){
                System.out.println(contacto.correo);
            }
        }
        mensaje.mostrarInfo("\033[33m" + "Contacos de Empresas" + "\033[0m");
        for (ContactoEmpresa contactoEmpresa: Main.agenda.contactoEmpresas){
            if(contactoEmpresa.id != null){
                System.out.print(contactoEmpresa.id +" ");
            }
            if(contactoEmpresa.nombreE != null){
                System.out.print(contactoEmpresa.nombreE +" ");
            }
            if(contactoEmpresa.telefonoE != null){
                System.out.print(contactoEmpresa.telefonoE + " ");
            }
            if(contactoEmpresa.correoE != null){
                System.out.print(contactoEmpresa.correoE +" ");
            }
            if(contactoEmpresa.ubicacion != null){
                System.out.println(contactoEmpresa.ubicacion);
            }
        }

        String volverAlMenu;
        Scanner teclado = new Scanner(System.in);
        System.out.println();
        System.out.println("Presiona intro para volver al menu: ");
        try {
            volverAlMenu = teclado.nextLine();
        } catch (Exception e) {
        }
    }

}

