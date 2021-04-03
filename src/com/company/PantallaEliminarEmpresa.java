package com.company;

public class PantallaEliminarEmpresa {

    void mostrar() {
        System.out.println("--------------------");
        System.out.println("|  ELIMINAR EMPRESA  |");
        System.out.println("--------------------");

        System.out.println("Nombre de la empresa a eliminar: ");
        String buscar = Main.scanner.nextLine();
        boolean encontrar = false;
        ContactoEmpresa contactoencontradoE = null;

        for(ContactoEmpresa contactoEmpresa: Main.agenda.contactoEmpresas){
            if (contactoEmpresa.nombreE.equals(buscar)){
                encontrar = true;
                contactoencontradoE = contactoEmpresa;
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
            EliminarEmpresa eliminarEmpresa = new EliminarEmpresa();
            eliminarEmpresa.mostrar(contactoencontradoE);
        }
    }
}