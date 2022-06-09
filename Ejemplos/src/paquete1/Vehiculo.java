/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author spart
 */
public class Vehiculo {

    private String tipo;
    private String matricula;
    private double valor;
    
    public Vehiculo(String v){
        tipo = v;
    }
    
    public void establecerTipo(String v){
        tipo = v;
    }
    
    public void establecerMatricula(String v){
        tipo = v;
    }
    
    public void establecerValor(double v){
        valor = v;
    }
    
     public String obtenerTipo(){
        return tipo;
    }    
   
    public String obtenerMatricula(){
        return matricula;
    }
    
     public double obtenerValor(){
        return valor;
    }    
}
