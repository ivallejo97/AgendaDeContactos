package com.company;

public class PantallaBuscarEmpresa {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("     BUSCAR EMPRESA     ");

        CampoObligatorio campoObligatorio = new CampoObligatorio();

        String buscar = campoObligatorio.pedir("Nombre de la empresa: " ,true);

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
            BuscarEmpresa buscarEmpresa = new BuscarEmpresa();
            buscarEmpresa.mostrar(contactoencontradoE);
        }
    }
}
