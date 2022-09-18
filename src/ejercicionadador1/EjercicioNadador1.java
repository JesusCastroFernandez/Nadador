/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionadador1;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class EjercicioNadador1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // (no hay constantes en este programa)
        
        // Variables de entrada
        int largosTotales;
        double longitudPiscina;
        
        // Variables de salida
        double distanciaCrol,distanciaBraza, distanciaEspalda; // En metros
        double distanciaTotal;  // En kilómetros

        // Variables auxiliares
        int largosCrol, largosBraza, largosEspalda;
        
        // Clase Scanner para peticióde datos
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ENTRENAMIENTO DE NATACIÓN");
        System.out.println("-------------------------");
        System.out.println(" ");
        System.out.print("Introduzca el número total de largos realizados: ");
        largosTotales = teclado.nextInt();
        System.out.print("Introduzca la longitud de la piscina: ");
        longitudPiscina = teclado.nextDouble();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        // Cálculo de la cantidad de largos de cada estilo
        largosCrol    = largosTotales / 2 + largosTotales % 2;
        largosBraza   = largosTotales / 4 + largosTotales % 4;
        largosEspalda = largosTotales / 2;
        
        //´Cálculo de la distancia en cada estilo (en metros)
        distanciaCrol   = largosCrol    * longitudPiscina;
        distanciaBraza  = largosBraza   * longitudPiscina;
        distanciaEspalda= largosEspalda * longitudPiscina;
        
        // Cálculo de la distancia total (en kilómetros)
        distanciaTotal = largosTotales * longitudPiscina / 1000;
        
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println();
        System.out.println("DISTANCIAS RECORRIDAS");
        System.out.println("---------------------");
        System.out.println("Distancia recorrida a crol (metros): " + distanciaCrol);
        System.out.println("Distancia recorrida a braza (metros): " + distanciaBraza);
        System.out.println("Distancia recorrida a espalda (metros): " + distanciaEspalda);
        System.out.println("Distancia total recorrida (kilómetros): " + distanciaTotal);

        System.out.println();
        System.out.println("Fin del programa. Bye!");
    }
    
}
