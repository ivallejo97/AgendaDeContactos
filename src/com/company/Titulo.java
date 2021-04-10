package com.company;

public class Titulo {
    void mostrar(String titulo){
        System.out.println("\033[34m" + "--------------------------" + "\033[0m");
        System.out.println("\033[34m" + "|"      + titulo +      "|" + "\033[0m");
        System.out.println("\033[34m" + "--------------------------" + "\033[0m");
    }
}
