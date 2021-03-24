package com.company;

import java.util.Scanner;

public class PantallaListar {

    void mostrar(){
        System.out.println("-------------------------");
        System.out.println("|  CONTACTOS GUARDADOS  |");
        System.out.println("-------------------------");


        System.out.println("\033[33m" + "Contactos Personales" + "\033[0m");
        for(Contacto contacto: Main.agenda.contactos){
            if (contacto.nombre == null){
            } else{
                System.out.print(contacto.nombre + " ");
            }
            if (contacto.apellido == null){
            } else{
                System.out.print(contacto.apellido +" ");
            }
            if (contacto.telefono == null){
            } else{
                System.out.print(contacto.telefono + " ");
            }
            if (contacto.correo == null){
            } else{
                System.out.println(contacto.correo);
            }
        }
        System.out.println("\033[33m" + "Contacos de Empresas" + "\033[0m");
        for (ContactoEmpresa contactoEmpresa: Main.agenda.contactoEmpresas){
            if(contactoEmpresa.id == null){
            } else{
                System.out.print(contactoEmpresa.id +" ");
            }
            if(contactoEmpresa.nombreE == null){
            } else{
                System.out.print(contactoEmpresa.nombreE +" ");
            }
            if(contactoEmpresa.telefonoE == null){
            } else{
                System.out.print(contactoEmpresa.telefonoE + " ");
            }
            if(contactoEmpresa.correoE == null){
            } else{
                System.out.print(contactoEmpresa.correoE +" ");
            }
            if(contactoEmpresa.ubicacion == null){
            } else{
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
//

