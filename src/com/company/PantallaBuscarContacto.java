package com.company;

public class PantallaBuscarContacto {
    void mostrar() {
        System.out.println("---------------------");
        System.out.println("|  BUSCAR CONTACTO  |");
        System.out.println("---------------------");

        System.out.println("Nombre del contacto: ");
        String buscarNombre = Main.scanner.nextLine();
        System.out.println("Apellido del contacto: ");
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
            BuscarContacto buscarContacto = new BuscarContacto();
            buscarContacto.mostrar(contactoencontrado);
        }
    }
}
