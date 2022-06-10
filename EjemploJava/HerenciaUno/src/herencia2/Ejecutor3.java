/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author spart
 */
public class Ejecutor3 {
    //Ingrese por teclado
    //un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como
    //opcion
    //un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
    //opcion
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Estudiantes");
        System.out.println("1 - Estudiante Presencial\n"
                + "2 - Estudiante Distancia");
        int estudiante = entrada.nextInt();
        if (estudiante > 2 || estudiante < 1) {
            System.out.println("Opcion Incorrecta");
        } else {
            System.out.println("Ingrese nombres: ");
            entrada.nextLine();
            String nombres = entrada.nextLine();
            System.out.println("Ingrese apellidos: ");
            String apellidos = entrada.nextLine();
            System.out.println("Ingrese identificacion: ");
            String identificacion = entrada.nextLine();
            System.out.println("Ingrese edad: ");
            int edad = entrada.nextInt();
            switch (estudiante) {
                case (1):
                    System.out.println("Estudiante Presencial");
                    System.out.println("Ingrese numero asignaturas: ");
                    int asignaturas = entrada.nextInt();
                    System.out.println("Ingrese costo asignaturas: ");
                    double costoAsignatura = entrada.nextDouble();
                    EstudianteDistancia ed1 = new EstudianteDistancia();
                    ed1.establecerNombresEstudiante(nombres);
                    ed1.establecerApellidoEstudiante(apellidos);
                    ed1.establecerIdentificacionEstudiante(identificacion);
                    ed1.establecerEdadEstudiante(edad);
                    ed1.establecerNumeroAsginaturas(asignaturas);
                    ed1.establecerCostoAsignatura(costoAsignatura);
                    ed1.calcularMatriculaDistancia();

                    System.out.printf("%s\n", ed1);
                    break;
                case (2):
                    System.out.println("Estudiante Distancia");
                    System.out.println("Ingrese numero creditos: ");
                    int numeroCreditos = entrada.nextInt();
                    System.out.println("Ingrese costo creditos: ");
                    double costoCredito = entrada.nextDouble();
                    EstudiantePresencial ep1 = new EstudiantePresencial();
                    ep1.establecerNombresEstudiante(nombres);
                    ep1.establecerApellidoEstudiante(apellidos);
                    ep1.establecerIdentificacionEstudiante(identificacion);
                    ep1.establecerEdadEstudiante(edad);
                    ep1.establecerNumeroCreditos(numeroCreditos);
                    ep1.establecerCostoCredito(costoCredito);
                    ep1.calcularMatriculaPresencial();

                    System.out.printf("%s\n", ep1);
                    break;

            }
        }
    }
}
