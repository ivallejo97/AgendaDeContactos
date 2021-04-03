package com.company;

public class PantallaEliminarContacto {
    void mostrar() {
        System.out.println("-----------------------");
        System.out.println("|  ELIMINAR CONTACTO  |");
        System.out.println("-----------------------");

        System.out.println("Nombre del contacto a eliminar: ");
        String buscarNombre = Main.scanner.nextLine();
        System.out.println("Apellido del contacto a eliminar: ");
        String buscarApellido = Main.scanner.nextLine();
        boolean encontrar = false;
        Contacto contactoencontrado = null;

        for(Contacto contacto: Main.agenda.contactos){
            if (contacto.nombre.equals(buscarNombre) && contacto.apellido.equals(buscarApellido)){
                encontrar = true;
                contactoencontrado = contacto;
            }
        }
        if(!encontrar){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarError("Contacto no encontrado");
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }
        } else {
            EliminarContacto eliminarContacto = new EliminarContacto();
            eliminarContacto.mostrar(contactoencontrado);
        }
    }
}