/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Conexion;
import model.Usuario;

/**
 *
 * @author jcuel
 */
public class UsuarioController {

    public boolean UsuarioLogin(Usuario objeto) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        String consulta = "SELECT nickusu, passusu FROM usuario WHERE nickusu='" + objeto.getNickusu() + "' and passusu = '" + objeto.getPassusu() + "'";
        Statement st;
        try
        {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(consulta);

            while (rs.next())
            {
                return respuesta = true;
            }
        } catch (SQLException e)
        {
            System.out.println("Error al consultar el usuario: " + e);
        }
        return respuesta;
    }
}
