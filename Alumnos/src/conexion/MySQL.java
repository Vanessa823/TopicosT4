/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class MySQL {

    protected Connection conexion;

    public MySQL() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/escuela", "root", "");
            System.out.println("Conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con el servidor");
        }
    }

    public boolean ejecutaSQL(String sql) {
        boolean b = false;
        try {
            Statement consulta = conexion.createStatement();
            consulta.executeUpdate(sql);
            consulta.close();
            b = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b;
    }

    public Connection getConexion() {
        return conexion;
    }

    public ResultSet consultaSQL(String sql) {
        ResultSet consul = null;
        try {
            Statement consulta = conexion.createStatement();
            consul = consulta.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return consul;
    }
}
