/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author sofiv
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                System.out.println("Ingrese los valores del arreglo");
                datos[i][j] = entrada.nextDouble();
            }
        }
        System.out.println("Los valores ingresados para el arreglo son");

        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length; j++) {
                // System.out.println("Los valores ingresados son");
                System.out.println(datos[i][j]);
            }
        }
    }

}
