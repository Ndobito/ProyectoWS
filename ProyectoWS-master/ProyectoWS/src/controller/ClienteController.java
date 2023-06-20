/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import model.Cliente;
import model.Conexion;
import model.Persona;

/**
 *
 * @author jcuel
 */
public class ClienteController {

    public boolean guardarCliente(Cliente objeto) {
        boolean respuesta = false;
        Connection con = Conexion.conectar();
        try
        {
            PreparedStatement consulta = con.prepareStatement("INSERT INTO cliente(idcli, namcli, surnamcli, dnicli, phoncli, adrcli, statecli) VALUES (?, ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNomCli());
            consulta.setString(3, objeto.getApeCli());
            consulta.setString(4, objeto.getDniCli());
            consulta.setString(5, objeto.getTelCli());
            consulta.setString(6, objeto.getDirCli());
            consulta.setInt(7, 1);

            if (consulta.executeUpdate() > 0)
            {
                return respuesta = true;
            }
            con.close();
        } catch (SQLException e)
        {
            System.out.println("Error al guardar el cliente: " + e);
        }

        return respuesta;
    }

    public boolean editarCliente(Cliente objeto) {
        boolean respuesta = false;
        
        Connection con = Conexion.conectar();
        try
        {
            PreparedStatement editar = con.prepareStatement("UPDATE cliente SET namcli = '" + objeto.getNomCli() + "', surnamcli = '" + objeto.getApeCli() + "', dnicli = '" + objeto.getDniCli() + "', phoncli = '" + objeto.getTelCli() + "', adrcli= '" + objeto.getDirCli() + "' WHERE idcli = '" + objeto.getIdCli() + "'");

            while (editar.executeUpdate() > 0)
            {
                return respuesta = true;
            }
        } catch (SQLException e)
        {
            System.out.println("Error al editar el cliente");
        }
        return respuesta;
    }

    public boolean eliminarCliente(Cliente objeto) {
        boolean respuesta = false;

        Connection con = Conexion.conectar();
        try
        {
            PreparedStatement editar = con.prepareStatement("DELETE FROM cliente WHERE idcli = '" + objeto.getIdCli() + "'");

            while (editar.executeUpdate() > 0)
            {
                return respuesta = true;
            }
        } catch (SQLException e)
        {
            System.out.println("Error al eliminar el cliente");
        }
        return respuesta;
    }
}
