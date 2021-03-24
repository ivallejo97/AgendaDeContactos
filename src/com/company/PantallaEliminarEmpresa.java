package com.company;

public class PantallaEliminarEmpresa {

    void mostrar() {
        System.out.println("--------------------");
        System.out.println("|  ELIMINAR EMPRESA  |");
        System.out.println("--------------------");

        System.out.println("Contacto a eliminar");
        String buscar = Main.scanner.nextLine();
        boolean encontrar = false;
        ContactoEmpresa contactoencontradoE = null;

        for(ContactoEmpresa contactoEmpresa: Main.agenda.contactoEmpresas){
            if (contactoEmpresa.id.equals(buscar)){
                encontrar = true;
                contactoencontradoE = contactoEmpresa;
            }
        }
        if(!encontrar){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarError("Contacto no encontrado");
        } else {
            EliminarEmpresa eliminarEmpresa = new EliminarEmpresa();
            eliminarEmpresa.mostrar(contactoencontradoE);
        }
    }
}
//