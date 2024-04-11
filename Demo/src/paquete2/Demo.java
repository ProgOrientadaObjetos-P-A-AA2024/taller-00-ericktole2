/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Mensaje;
import paquete3.Informacion;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadena = " ";
        int num;
        // Despues de impotar las clases, utilizamos un prinf y llamamos las 
        // funciones para que de esa manera
        // poder completar la frase deseada
        cadena = String.format("%s con %d\n", Mensaje.obtenerMensaje(),
                Informacion.obtenerHabitantes());
        System.err.println("ingrese un numero ");
        num = entrada.nextInt();
        if (num <= 5) {
            System.out.println(cadena);

        } else {
        
        System.out.printf("%s",cadena.toUpperCase());

    }
}

}
