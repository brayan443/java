/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

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

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int i;
		String nombre[];
		double nota;
		int op;
		int opcion;
		// ingreso al curso,consultar usuarios,resultados
		nombre = new String[8];
		do {
			System.out.println("1)In gresar al curso: ");
			System.out.println("2)Consultar Usuarios: ");
			System.out.println("3)Resultados: ");
			System.out.println("4)salir: ");
			System.out.println("elija una opción (1-4): ");
			op = Integer.parseInt(bufEntrada.readLine());
			switch (op) {
			case 1:
				for (i=1;i<=8;i++) {
					System.out.println("nombre de usuario");
					nombre[i-1] = bufEntrada.readLine();
				}
				break;
			case 2:
				verusuario(nombre,i);
				break;
			case 3:
				for (i=1;i<=8;i++) {
					System.out.println("nota del usuario");
					nota = bufEntrada.readLine();
					nombre[i-1] = bufEntrada.readLine();
					if (nota>=3) {
						System.out.println("aprobo el curso");
					} else {
						System.out.println("no aprobo");
					}
				}
				break;
			}
		} while (op!==2);
	}

	public static void verusuario(String nombre[], int i) {
		for (i=1;i<=8;i++) {
			if (!nombre[i-1].equals("0")) {
				System.out.println(" "+nombre[i-1]);
			}
		}
	}


}

