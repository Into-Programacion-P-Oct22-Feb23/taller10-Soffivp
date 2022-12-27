/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

/**
 *
 * @author sofiv
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        String cadena = "";
        String nombre = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < 2; j++) {//usamos el limite para controlar el error de longitud
                nombre = estudiantes[i][j];
                if (nombre.startsWith("S") || nombre.startsWith("P") || nombre.startsWith("T")) {
                    cadena = String.format(" %s", nombre);
                    System.out.println(cadena);
                }

            }

        }

    }
}
