/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sebastian
 */
public class Medaparte {
    private String nombre;
    private String tipo;
    private String habilidad;
    //private String recuperacion;
    private int ataque;
    private int salud;
    private int precision;
    private int defensa;
    private int esquive;
    private int ph ;
    
    public Medaparte (String nombre) throws SQLException{
        DBConection conexion=new DBConection();
        if(conexion.conectar()){
         Statement stm=conexion.consultar();
         String nombre1="'"+nombre+"'";
         String seleccionar= "SELECT *FROM MEDAPARTE WHERE NOMBRE="+nombre1 ;
         System.out.println(nombre1+nombre);
         ResultSet re=stm.executeQuery(seleccionar);
         while(re.next()){
          
          this.habilidad=re.getString(5);
          this.ataque=re.getInt(4);
          this.salud = re.getInt(2);
          this.defensa = re.getInt(6);
          this.precision = re.getInt(7);
          this.ph=re.getInt(10);
          this.esquive=re.getInt(9);
          this.tipo=re.getString(3);
         }
         this.nombre=nombre;
   
          System.out.println(this.nombre);
        }
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre){ 
        this.nombre=nombre;
    }  
    public int getSalud() {
        return salud;
    }
}

    