/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;
/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);

        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);

        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);

        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        
        
        
        Vehiculo ve1 = new Vehiculo("Auto");
        ve1.establecerMatricula("LBB0011");
        ve1.establecerValor(10000);

        Edificio ve2 = new Edificio("Camioneta");
        ve1.establecerMatricula("LCB0011");
        ve2.establecerCostos(20000);

        Edificio ve3 = new Edificio("Auto");
        ve1.establecerMatricula("LBD0011");
        ve3.establecerCostos(6000);

        Edificio ve4 = new Edificio("Camioneta");
        ve1.establecerMatricula("LC0011");
        ve4.establecerCostos(10000);
        
        Edificio ve5 = new Edificio("Camioneta");
        ve1.establecerMatricula("LBB0011");
        ve5.establecerCostos(25000);

        Edificio[] listaEdificios = {edf1, edf2, edf3, edf4};
        //double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);

        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        Empresa miempresa = new Empresa();
        miempresa.establecerNombre("Empresa de Hojas");
        miempresa.establecerEdificios(listaEdificios);
        miempresa.establecerCostoBienesInmuebles();
        // Imprimir el costo de los bienes inmuebles de la empresa
        
        //System.out.printf("%.2f\n", miempresa.obtenerCostoBienesInmuebles());
        System.out.printf("%s\n", miempresa);
    }
}
