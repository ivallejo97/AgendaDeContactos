package com.company;

import static com.company.Main.agenda;

public class EditarContacto {

    void mostrar(Contacto contacto) {
        System.out.println("--------------------");
        System.out.println("|  EDITAR CONTACTO  |");
        System.out.println("--------------------");

                CampoObligatorio campoObligatorio = new CampoObligatorio();

                contacto.nombre = campoObligatorio.pedir("Nuevo nombre del contacto:" ,true);

                contacto.apellido = campoObligatorio.pedir("Nuevos apellidos del contacto", true);

                contacto.telefono = campoObligatorio.pedir("Nuevo numero de telefono del contacto:", true);

                contacto.correo = campoObligatorio.pedir("Nuevo correo electronico del contacto");

                Mensaje mensaje = new Mensaje();
                mensaje.mostrarInfo("El contacto se ha actualizado y guardado correctamente");

                Mensaje mensaje1 = new Mensaje();
                mensaje.mostrarOpc("Que desea hacer ahora:");
                System.out.println();

                Menu menu = new Menu();
                String[] opciones = {"Editar Contacto", "Editar empresa", "Volver al menu"};
                String opcion = menu.elegirOpcion(opciones);

                if ("1".equals(opcion)) {
                    PantallaEditarContacto pantallaEditarContacto = new PantallaEditarContacto();
                    pantallaEditarContacto.mostrar();
                } else if("2".equals(opcion)){
                    PantallaEditarEmpresa pantallaEditarEmpresa = new PantallaEditarEmpresa();
                    pantallaEditarEmpresa.mostrar();
                } else if ("3".equals(opcion)) {
                    PantallaMenu pantallaMenu = new PantallaMenu();
                    pantallaMenu.mostrar();
                }
    }
}

//