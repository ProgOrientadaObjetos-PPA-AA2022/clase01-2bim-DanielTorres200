/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Scanner;
import herencia1.EstudianteDistancia;
import java.util.Locale;

/**
 *
 * @author spart
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.ITALY);
        
        System.out.println("ingrese nombres:");
        String nombres = entrada.nextLine();
        System.out.println("ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("ingrese identificacion");
        String identificacion = entrada.nextLine();
        System.out.println("ingrese edad");
        int edad = entrada.nextInt();
        System.out.println("ingrese numero de asignaturas");
        int asignatura = entrada.nextInt();
        System.out.println("ingrese costo de asignaturas");
        int costoAsignatura = entrada.nextInt();
        System.out.println("ingrese matricula distancia");
        int matricula = entrada.nextInt();
        
        EstudianteDistancia estudiante = new EstudianteDistancia();
        
        estudiante.establecerNombresEstudiante(nombres);
        estudiante.establecerApellidoEstudiante(apellidos);
        estudiante.establecerEdadEstudiante(edad);
        estudiante.establecerIdentificacionEstudiante(identificacion);
        estudiante.establecerNumeroAsginaturas(asignatura);
        estudiante.establecerCostoAsignatura(costoAsignatura);
        estudiante.calcularMatriculaDistancia(); 
    }
}
