package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    static final String url = "jdbc:sqlite:database.db";

    static BaseDeDatos instance;
    static Connection connection;

    public static BaseDeDatos get(){
        if(instance == null){
            instance = new BaseDeDatos();

            try {
                connection = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        }
        return instance;
    }

    void PantallaMenu(){
        try  {
            PantallaMenu pantallaMenu = new PantallaMenu();
            pantallaMenu.mostrar();
            connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void PantallaCrear(){
        try  {
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrar();
            connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void PantallaListar(){
        try  {
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrar();
            connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void PantallaBuscar(){
        try  {
            PantallaBuscar pantallaBuscar = new PantallaBuscar();
            pantallaBuscar.mostrar();
            connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void PantallaEditar(){
        try  {
            PantallaEditar pantallaEditar = new PantallaEditar();
            pantallaEditar.mostrar();
            connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void PantallaEliminar(){
        try  {
            PantallaEliminar pantallaEliminar = new PantallaEliminar();
            pantallaEliminar.mostrar();
            connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void Menu(){
        try  {
            Menu menu = new Menu();
            connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void CrearContacto(String nombre, String apellido, String telefono, String correo) {
        String sql = "INSERT INTO contactos(nombre,apellidos,telefono,correo) VALUES(?,?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, telefono);
            preparedStatement.setString(4, correo);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}