package com.company;

public class PantallaEliminarEmpresa {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("    ELIMINAR EMPRESA    ");

        CampoObligatorio campoObligatorio = new CampoObligatorio();

        String buscar = campoObligatorio.pedir("Nombre de la empresa a eliminar: " ,true);

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