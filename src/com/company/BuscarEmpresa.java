package com.company;

import java.util.Scanner;

public class BuscarEmpresa {
    void mostrar(ContactoEmpresa contactoEmpresa) {
        System.out.println("------------------------");
        System.out.println("|  EMPRESA ENCONTRADA  |");
        System.out.println("------------------------");

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
