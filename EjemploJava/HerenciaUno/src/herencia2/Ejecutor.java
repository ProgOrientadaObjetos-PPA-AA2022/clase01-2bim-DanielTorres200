/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;

/**
 *
 * @author spart
 */
public class Ejecutor {

    public static void main(String[] args) {
        EstudiantePresencial e1 = new EstudiantePresencial();

        e1.establecerNombresEstudiante("Rene Ronaldo");
        e1.establecerApellidoEstudiante("Elizalde Solano");
        e1.establecerIdentificacionEstudiante("11509583083");
        e1.establecerEdadEstudiante(38);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();

        System.out.println("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificacion: %s\n"
                + "Edad: %d\n"
                + "Numero de credito: %s\n"
                + "Costo de credito: %.2f\n"
                + "Costo matricula: %.1f\n");
        e1.obtenerNombresEstudiante();
        e1.obtenerApellidoEstudiante();
        e1.obtenerIdentificacionEstudiante();
        e1.obtenerEdadEstudiante();
        e1.obtenerNumeroCreditos();
        e1.obtenerCostoCredito();
        e1.obtenerMatriculaPresencial();
    }
}
