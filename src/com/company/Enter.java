package com.company;

import java.util.Scanner;

public class Enter {
    void mostrar(){
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
