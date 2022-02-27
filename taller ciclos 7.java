/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PARQUEADERO.java."

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

public class parqueadero {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	public static void ingresarvehiculo(double ingresado, double cantidadpuestos, String puesto[], String propietario[], String placa[], String horaingreso[], int ocupados[]) throws IOException {
		int i;
		int indice;
		if (ingresado>cantidadpuestos-1) {
			System.out.println("NO hay puestos disponibles");
		} else {
			System.out.println("¿Donde desea realizar el ingreso?");
			for (i=1;i<=cantidadpuestos-1;i++) {
				if (ocupados[i-1]==-1) {
					System.out.println(Double.toString(i+1)+" :: "+puesto[i-1]);
				}
			}
			indice = Integer.parseInt(bufEntrada.readLine());
			indice = indice-1;
			System.out.print("Propietario");
			propietario[indice-1] = bufEntrada.readLine();
			System.out.print("Placa del vehiculo");
			placa[indice-1] = bufEntrada.readLine();
			System.out.print("Hora de ingreso ");
			horaingreso[indice-1] = bufEntrada.readLine();
			// Almacenar el ingreso realizado
			ocupados[indice-1] = indice;
			System.out.println("Registro con éxito");
			System.out.println(puesto[indice-1]+" "+placa[indice-1]+" "+horaingreso[indice-1]+" "+propietario[indice-1]);
			ingresado = ingresado+1;
		}
	}

	public static void puestosasignados(double ingresado, double ocupados[], double cantidadpuestos, String propietario[], String placa[], String puesto[], String horaingreso[]) {
		int i;
		if (ingresado==0) {
			System.out.println("Sin ingreso...");
		} else {
			for (i=0;i<=cantidadpuestos-1;i++) {
				if (ocupados[i-1]!=-1) {
					System.out.println(propietario[i-1]+"  "+placa[i-1]+"  "+puesto[i-1]+"  "+horaingreso[i-1]);
				}
			}
		}
	}

	public static void main(String args[]) throws IOException {
		int cantidadpuestos;
		String horaingreso[];
		String horasalida[];
		int i;
		int ingresado;
		double ocupados[];
		int opcion;
		String placa[];
		String propietario[];
		String puesto[];
		double valorminuto;
		// Definición de variables
		cantidadpuestos = 5;
		// Definición de vectores
		placa = new String[cantidadpuestos];
		puesto = new String[cantidadpuestos];
		horaingreso = new String[cantidadpuestos];
		horasalida = new String[cantidadpuestos];
		propietario = new String[cantidadpuestos];
		ocupados = new double[cantidadpuestos];
		// Inicializar variables
		opcion = 0;
		valorminuto = 300;
		ingresado = 0;
		for (i=1;i<=cantidadpuestos-1;i++) {
			puesto[i-1] = "A"+Double.toString(i);
			ocupados[i-1] = -1;
		}
		System.out.println("                ###############################");
		System.out.println("                # Paqueadero MaxTechnology 24/7 #");
		System.out.println("                ###############################");
		System.out.println("");
		do {
			System.out.println("-------------------------------");
			System.out.println("| 1. Ingresar vehiculo        |");
			System.out.println("| 2. Dar salida a un vehiculo |");
			System.out.println("| 3. Consultar disponibilidad |");
			System.out.println("| 4. Puestos asignados        |");
			System.out.println("| 5. Salir                    |");
			System.out.println("-------------------------------");
			System.out.println("");
			opcion = Integer.parseInt(bufEntrada.readLine());
			switch (opcion) {
			case 1:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				ingresarvehiculo(ingresado,cantidadpuestos,puesto,propietario,placa,horaingreso,ocupados);
				break;
			case 2:
				System.out.println("Dar salida");
				break;
			case 3:
				System.out.println("Disponibilidad");
				break;
			case 4:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				puestosasignados(ingresado,ocupados,cantidadpuestos,propietario,placa,puesto,horaingreso);
				break;
			case 5:
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				System.out.println("Chao.");
				break;
			default:
				System.out.println("Opción no valida");
			}
		} while (opcion!=5);
	}


}

