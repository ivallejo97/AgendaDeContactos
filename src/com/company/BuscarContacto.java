package com.company;

import java.util.Scanner;

public class BuscarContacto {

    void mostrar(Contacto contacto) {
        Titulo titulo = new Titulo();
        titulo.mostrar("   CONTACTO ENCONTRADO  ");

            if (contacto.nombre != null){
                System.out.print(contacto.nombre + " ");
            }
            if (contacto.apellido != null){
                System.out.print(contacto.apellido +" ");
            }
            if (contacto.telefono != null){
                System.out.print(contacto.telefono + " ");
            }
            if (contacto.correo != null){
                System.out.println(contacto.correo);
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
