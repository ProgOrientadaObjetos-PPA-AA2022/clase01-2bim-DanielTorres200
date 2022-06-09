/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo [] vehiculos;  //tipo, matricula, valor
    private double costoBienesInmuebles;
    private double costoVehiculos;
    private double costoTotalBienes;
    
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public void establecerVehiculos(Vehiculo[] m) {
        vehiculos = m;
    }
    
    public void establecerCostoBienesInmuebles(){
        double suma = 0 ;
        for (int i = 0; i < edificios.length; i++) {
            //for (int i = 0; i < obtenerEdificios().length; i++)
            suma = suma + edificios[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    
    public void establecerCostoBienes(){
        double suma = 0 ;
        for (int i = 0; i < vehiculos.length; i++) {
            //for (int i = 0; i < obtenerEdificios().length; i++)
            suma = suma + vehiculos[i].obtenerValor();
        }
        costoTotalBienes = suma;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    
    public Vehiculo[] obtenerVehiculos() {
        return vehiculos;
    }
    
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    
    public double obtenerCostoBienes(){
        return costoTotalBienes;
    }
    
    public String toString(){
        String reporte = String.format("%s\nLista de Edificios\n", 
                obtenerNombre()); 
        for(int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d. %s (%.2f)\n", 
                    reporte, 
                    i+1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de inmuebles: %.2f\n", 
                reporte,
                costoBienesInmuebles);
        /////////////////////////////////////////////////////////
        reporte = String.format("%s\nLista de vehiculos\n", 
                obtenerNombre()); 
        for(int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d. %s (%.2f)\n", 
                    reporte, 
                    i+1,
                    vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula().toUpperCase(),
                    vehiculos[i].obtenerValor());
        }
        reporte = String.format("%sTotal de bienes: %.2f\n", 
                reporte,
                costoTotalBienes);
        
        return reporte;
        
    }
}
