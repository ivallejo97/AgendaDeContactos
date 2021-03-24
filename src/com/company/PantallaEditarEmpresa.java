package com.company;

public class PantallaEditarEmpresa {

    void mostrar() {
        System.out.println("--------------------");
        System.out.println("|  EDITAR EMPRESA  |");
        System.out.println("--------------------");


        System.out.println("Empresa a editar");
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
            EditarEmpresa editarEmpresa = new EditarEmpresa();
            editarEmpresa.mostrar(contactoencontradoE);
        }
    }
}
