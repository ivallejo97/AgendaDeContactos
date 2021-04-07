package com.company;

public class CrearContacto {

    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("     CREAR CONTACTO     ");

        Contacto contacto = new Contacto();
        boolean creado = false;

        CampoObligatorio campoObligatorio = new CampoObligatorio();

        contacto.nombre = campoObligatorio.pedir("Nombre del contacto:" ,true);

        contacto.apellido = campoObligatorio.pedir("Apellidos del contacto", true);

        contacto.telefono = campoObligatorio.pedir("Numero de telefono del contacto:", true);

        contacto.correo = campoObligatorio.pedir("Correo electronico del contacto");

        creado = true;

        if(creado == true){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Se ha creado el contacto!");
        }

        Main.agenda.contactos.add(contacto);

        System.out.println();

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpc("Que desea hacer ahora:");
        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"Crear contacto", "Crear Empresa", "Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            CrearContacto crearContacto = new CrearContacto();
            crearContacto.mostrar();
        } else if ("2".equals(opcion)) {
            CrearEmpresa crearEmpresa = new CrearEmpresa();
            crearEmpresa.mostrar();
        } else if ("3".equals(opcion)) {
            return false;
        }
        return true;

    }
}