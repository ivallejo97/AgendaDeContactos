package com.company;

import java.util.Scanner;

public class BuscarEmpresa {
    void mostrar(ContactoEmpresa contactoEmpresa) {
       Titulo titulo = new Titulo();
       titulo.mostrar("   EMPRESA ENCONTRADA   ");

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
