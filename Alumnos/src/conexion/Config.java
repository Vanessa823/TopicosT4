/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import javax.swing.JTable;

/**
 *
 * @author hp
 */
public class Config {
    public static MySQL conex;
    
    public static void configTabla(JTable table,int col,int v){
        table.getColumnModel().getColumn(col).setMaxWidth(v);
        table.getColumnModel().getColumn(col).setMinWidth(v);
        table.getTableHeader().getColumnModel().getColumn(col).setMaxWidth(v);
        table.getTableHeader().getColumnModel().getColumn(col).setMinWidth(v);
    }
    
    public static int convertirEntero(String n){
        try{
            return Integer.parseInt(n);
        }catch(Exception e){
            return 0;
        }
    }
    
    public static double convertirDouble(String n){
        try{
            return Double.parseDouble(n);
        }catch(Exception e){
            return 0;
        }
    }    
}
