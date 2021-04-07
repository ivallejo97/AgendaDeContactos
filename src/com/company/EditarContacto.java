package com.company;

import static com.company.Main.agenda;

public class EditarContacto {

    boolean mostrar(Contacto contacto) {
        Titulo titulo = new Titulo();
        titulo.mostrar("     EDITAR CONTACTO    ");

                CampoObligatorio campoObligatorio = new CampoObligatorio();

                contacto.nombre = campoObligatorio.pedir("Nuevo nombre del contacto:" ,true);

                contacto.apellido = campoObligatorio.pedir("Nuevos apellidos del contacto", true);

                contacto.telefono = campoObligatorio.pedir("Nuevo numero de telefono del contacto:", true);

                contacto.correo = campoObligatorio.pedir("Nuevo correo electronico del contacto");

                Mensaje mensaje = new Mensaje();
                mensaje.mostrarInfo("El contacto se ha actualizado correctamente");

                System.out.println();

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
                    return false;
                }
        return true;
    }
}