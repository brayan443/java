/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo5.pkg0;

/**
 *
 * @author braya
 */
public class Arreglo50 {
/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. Técnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos actúa como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) actúa como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deberán modificarse algunos métodos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepción. Si una función A es
// invocada por otra B, B también debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el código generado automáticamante: las funciones que realizan lecturas
// directamente incluyen el código que indica que pueden generar dicha excepción, pero las que
// lo hacen indirectamente (invocando a otras que sí lo hacen), puede que no, y deberán ser
// corregidas manualmente.

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) {
		int columnas;
		int filas;
		String tabla_multiplicar[][];
		filas = 10;
		columnas = 10;
		tabla_multiplicar = new String[filas][columnas];
		rellenacolumnastabla(tabla_multiplicar,filas);
		cuadro_de_multiplicar(tabla_multiplicar,filas,columnas);
		mostrararreglo(tabla_multiplicar,filas,columnas);
	}

	public static void cuadro_de_multiplicar(double tabla_multiplicar[][], double filas, double columnas) {
		int i;
		int j;
		for (i=2;i<=filas;i++) {
			for (j=2;j<=columnas;j++) {
				tabla_multiplicar[i-1][j-1] = tabla_multiplicar[i-1][j-1]*tabla_multiplicar[i-1][j-1];
			}
		}
	}

	public static void rellenacolumnastabla(int tabla_multiplicar[][], double filas) {
		int contador;
		int i;
		contador = 0;
		for (i=1;i<=filas;i++) {
			tabla_multiplicar[0][i-1] = contador;
			tabla_multiplicar[i-1][0] = contador;
			contador = contador+1;
		}
	}

	public static void mostrararreglo(String tabla_multiplicar[][], double filas, double columnas) {
		double i;
		double j;
		for (i=1;i<=filas;i++) {
			for (j=1;j<=columnas;j++) {
				System.out.print(tabla_multiplicar[i-1][j-1]+" ");
			}
		}
	}


}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
