package com.company;

public class PantallaEliminarContacto {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("    ELIMINAR CONTACTO   ");

        CampoObligatorio campoObligatorio = new CampoObligatorio();

        String buscarNombre = campoObligatorio.pedir("Nombre del contacto a eliminar: " ,true);
        String buscarApellido = campoObligatorio.pedir("Apellido del contacto a eliminar: " ,true);

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