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

        Enter enter = new Enter();
        enter.mostrar();
    }
}
