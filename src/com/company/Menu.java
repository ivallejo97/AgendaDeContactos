package com.company;

import java.util.Scanner;

public class Menu {

    String elegirOpcion(String[] opciones){

        boolean seguirPidiendo = true;
        String opcion = "";
        while(seguirPidiendo) {
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            System.out.println("\nOpcion:");

            opcion = Main.scanner.nextLine();

            if (Integer.valueOf(opcion) > opciones.length) {
                Mensaje mensaje = new Mensaje();
                mensaje.mostrarError("No existe la opcion");
                String volverAlMenu;
                Scanner teclado = new Scanner(System.in);
                System.out.println();
                mensaje.mostrarOpc("Presiona intro para volver al menu: ");
                try
                {
                    volverAlMenu = teclado.nextLine();
                }
                catch(Exception e)
                {}
            } else {
                seguirPidiendo = false;
            }
        }

        return opcion;
    }
}