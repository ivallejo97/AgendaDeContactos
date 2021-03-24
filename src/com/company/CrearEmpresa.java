package com.company;

public class CrearEmpresa {
    void mostrar() {
        System.out.println("-------------------");
        System.out.println("|  CREAR EMPRESA  |");
        System.out.println("-------------------");

        ContactoEmpresa contactoEmpresa = new ContactoEmpresa();
        boolean creado = false;

        CampoObligatorio campoObligatorio = new CampoObligatorio();

        contactoEmpresa.id = campoObligatorio.pedir("Id de la empresa:", true);

        contactoEmpresa.nombreE = campoObligatorio.pedir("Nombre de la empresa:", true);

        contactoEmpresa.telefonoE = campoObligatorio.pedir("Numero de telefono de la empresa:", true);

        contactoEmpresa.correoE = campoObligatorio.pedir("Correo electronico de la empresa:");

        contactoEmpresa.ubicacion = campoObligatorio.pedir("Ubicacion de la empresa:");


        creado = true;

        if(creado == true){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarInfo("Se ha creado el contacto!");

        }

        Main.agenda.contactoEmpresas.add(contactoEmpresa);

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarOpc("Que desea hacer ahora:");
        System.out.println();

        Menu menu = new Menu();
        String[] opciones = {"Crear contacto", "Crear empresa", "Volver al menu"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            CrearContacto crearContacto = new CrearContacto();
            crearContacto.mostrar();
        } else if ("2".equals(opcion)) {
            CrearEmpresa crearEmpresa = new CrearEmpresa();
            crearEmpresa.mostrar();
        } else if ("3".equals(opcion)) {
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
        }

    }
}
