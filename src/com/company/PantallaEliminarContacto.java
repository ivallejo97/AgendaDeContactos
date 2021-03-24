package com.company;

public class PantallaEliminarContacto {
    void mostrar() {
        System.out.println("-----------------------");
        System.out.println("|  ELIMINAR CONTACTO  |");
        System.out.println("-----------------------");

        System.out.println("Contacto a eliminar");
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
            EliminarContacto eliminarContacto = new EliminarContacto();
            eliminarContacto.mostrar(contactoencontrado);
        }
    }
}
//