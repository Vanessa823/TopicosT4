/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla_alumno;

import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Alumno {

    private int numcontrol;
    private String nombre;
    private String apellido;
    private String fecha;
    private String sexo;
    private String carrera;

    public Alumno() {
    }

    public Alumno(int numcontrol, String nombre, String apellido, String fecnac, String sexo, String carrera) {
        this.numcontrol = numcontrol;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecnac;
        this.sexo = sexo;
        this.carrera = carrera;
    }
    private static final Logger LOG = Logger.getLogger(Alumno.class.getName());

    public int getNumcontrol() {
        return numcontrol;
    }

    public String getNombre() {
        return nombre;
    }

       public String getApellido() {
        return apellido;
    }

    public String getFecnac() {
        return fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCarrera() {
        return carrera;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public void setNumcontrol(int numcontrol) {
        this.numcontrol = numcontrol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecnac(String fecnac) {
        this.fecha = fecnac;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


}
