package com.company;

public class PantallaEditarContacto {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("     EDITAR CONTACTO    ");

        CampoObligatorio campoObligatorio = new CampoObligatorio();

        String buscarNombre = campoObligatorio.pedir("Nombre del contacto a editar: " ,true);
        String buscarApellido = campoObligatorio.pedir("Apellido del contacto a editar: " ,true);

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
            EditarContacto editarContacto = new EditarContacto();
            editarContacto.mostrar(contactoencontrado);
        }
    }
}