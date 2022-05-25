package conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tabla_alumno.Alumno;

/**
 *
 * @author hp
 */
public class Sql {

    

    static ArrayList<Alumno> consultaAlumnos(String sql) {
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
        ResultSet consul = Config.conex.consultaSQL(sql);
        try {
            while (consul.next()) {
                Alumno sel = new Alumno(consul.getInt("Num_control"), consul.getString("Nombre"), consul.getString("Apellidos"), consul.getString("Fecha_nacimiento"), consul.getString("Sexo"), consul.getString("Carrera"));
                lista.add(sel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public static ArrayList<Alumno> mostrar() {
        String sql = "SELECT * FROM alumno ORDER BY Num_control ASC";
        return consultaAlumnos(sql);
    }

    public static ArrayList<Alumno> mostrar(String buscar) {
        String sql = "SELECT * FROM alumno WHERE " + "Num_control LIKE '%" + buscar + "%' OR nombre LIKE '%" + buscar + "%' " + "ORDER BY Num_control ASC";
        return consultaAlumnos(sql);
    }

    public static boolean editar(Alumno a, String numecontrol) {
        String sql = "Update alumno set Num_control = '" + a.getNumcontrol() + "', Nombre ='" + a.getNombre() + "', Apellidos='" + a.getApellido() + "', Fecha_nacimiento='" + a.getFecnac() + "', Sexo='" + a.getSexo() + "', Carrera='" + a.getCarrera() + "' WHERE Num_control = '" + numecontrol + "'";
        return Config.conex.ejecutaSQL(sql);
    }

    public static boolean agregar(Alumno a) {
        String sql = "INSERT alumno VALUES ('" + a.getNumcontrol() + "','" + a.getNombre() + "','" + a.getApellido() + "','" + a.getFecnac() + "','" + a.getSexo() + "','" + a.getCarrera() + "')";
        return Config.conex.ejecutaSQL(sql);
    }
    public static boolean eliminar(String numecontrol) {
        String sql = "DELETE FROM alumno " + "WHERE Num_control = '" + numecontrol + "'";
        return Config.conex.ejecutaSQL(sql);
    }
    public static Alumno getAlumno(String numecontrol) {
        String sql = "SELECT * FROM alumno WHERE Num_control = '" + numecontrol + "'";
        ArrayList lista = Sql.consultaAlumnos(sql);
        return (lista.size() > 0) ? (Alumno) lista.get(0) : null;
    }
    
}
