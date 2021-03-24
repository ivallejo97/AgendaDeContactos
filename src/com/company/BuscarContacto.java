package com.company;

import java.util.Scanner;

public class BuscarContacto {

    void mostrar(Contacto contacto) {
        System.out.println("-------------------------");
        System.out.println("|  CONTACTO ENCONTRADO  |");
        System.out.println("-------------------------");

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
