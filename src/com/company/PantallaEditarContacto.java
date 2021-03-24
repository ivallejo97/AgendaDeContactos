package com.company;

public class PantallaEditarContacto {

    void mostrar() {
        System.out.println("---------------------");
        System.out.println("|  EDITAR CONTACTO  |");
        System.out.println("---------------------");

        System.out.println("Contacto a editar");
        String buscar = Main.scanner.nextLine();
        boolean encontrar = false;
        Contacto contactoencontrado = null;

        for(Contacto contacto: Main.agenda.contactos){
            if (contacto.nombre.equals(buscar)){
                encontrar = true;
                contactoencontrado = contacto;
            }
        }
        if(!encontrar){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarError("Contacto no encontrado");
        } else {
            EditarContacto editarContacto = new EditarContacto();
            editarContacto.mostrar(contactoencontrado);
        }
    }
}
