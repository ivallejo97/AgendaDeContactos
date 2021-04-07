package com.company;

public class PantallaEditarEmpresa {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("     EDITAR EMPRESA    ");

        CampoObligatorio campoObligatorio = new CampoObligatorio();

        String buscar = campoObligatorio.pedir("Nombre de la empresa a editar: " ,true);

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
            EditarEmpresa editarEmpresa = new EditarEmpresa();
            editarEmpresa.mostrar(contactoencontradoE);
        }
    }
}