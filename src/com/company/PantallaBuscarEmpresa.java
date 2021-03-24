package com.company;

public class PantallaBuscarEmpresa {
    void mostrar() {
        System.out.println("--------------------");
        System.out.println("|  BUSCAR EMPRESA  |");
        System.out.println("--------------------");

        System.out.println("Nombre de la empresa: ");
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
        } else {
            BuscarEmpresa buscarEmpresa = new BuscarEmpresa();
            buscarEmpresa.mostrar(contactoencontradoE);
        }
    }
}
