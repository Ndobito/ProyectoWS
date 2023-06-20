/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jcuel
 */
public class Conexion {

    public static Connection conectar() {
        try
        {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shoestore?useSSL=false", "root", "");
            return conexion;
        } catch (SQLException e)
        {
            System.out.println("Error al conectar a la Base de Datos: " + e);
        }
        return null;
    }
}
