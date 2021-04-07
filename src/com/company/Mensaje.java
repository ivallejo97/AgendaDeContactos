package com.company;

public class Mensaje {
    void mostrarError(String texto){
        printBefore();
        System.out.println("\033[31m" + texto + "\033[0m");
        printAfter();
    }

    void mostrarOpc(String texto){
        printBefore();
        System.out.println("\033[34m" + texto + "\033[0m");
        printAfter();
    }

    void mostrarInfo(String texto){
        printBefore();
        System.out.println("\033[32m" + texto + "\033[0m");
        printAfter();
    }

    void printBefore(){

    }

    static void printAfter(){

    }
}