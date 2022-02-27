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
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws IOException {
		int aux;
		int contador;
		int dato;
		int i;
		int j;
		int k;
		String lista_empresa[];
		String lista_nombre[];
		String lista_telefono[];
		String nombre;
		int numer;
		int op;
		lista_nombre = new String[4];
		lista_telefono = new String[4];
		lista_empresa = new String[4];
		j = 0;
		op = 0;
		i = 0;
		contador = 0;
		k = 0;
		inicializar(lista_nombre,lista_telefono,lista_empresa);
		do {
			System.out.println("----Menu----");
			System.out.println("1)crear contacto: ");
			System.out.println("2)ver contactos registrados: ");
			System.out.println("3)eliminar contactos por numero telefonico: ");
			System.out.println("4)salir: ");
			System.out.println("elija una opción (1-4): ");
			op = Integer.parseInt(bufEntrada.readLine());
			switch (op) {
			case 1:
				for (j=1;j<=1;j++) {
					if (lista_telefono[j-1].equals("0")) {
						contador = contador+1;
						k = 0;
						j = 3;
						System.out.println("valor de k = "+k+"j="+j);
					}
				}
				if (i<3 || contador>0) {
					aux = i;
					i = k;
					System.out.println("k="+k+"i="+i+"contador="+contador);
					guardarcontacto(lista_nombre,lista_telefono,lista_empresa,i);
					contador = 0;
					i = aux;
					i = i+1;
					System.out.println("i="+i);
				}
				break;
			case 2:
				System.out.println("i ="+i);
				vercontacto(lista_nombre,lista_telefono,lista_empresa,i);
				break;
			case 3:
				eliminarcontacto(lista_nombre,lista_telefono,lista_empresa,i);
				break;
			}
		} while (op!==4);
		System.out.println("saliendo de la APP");
		System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
	}

	public static void inicializar(String lista_nombre[], String lista_telefono[], String lista_empresa[]) {
		int l;
		for (l=1;l<=1;l++) {
			lista_nombre[l-1] = "0";
			lista_telefono[l-1] = "0";
			lista_empresa[l-1] = "0";
		}
	}

	public static void guardarcontacto(String lista_nombre[], String lista_telefono[], String lista_empresa[], String i) throws IOException {
		int contador;
		String num;
		int val;
		contador = 0;
		val = 0;
		System.out.println("Posición = "+i);
		System.out.println("Nombre :");
		lista_nombre[0] = bufEntrada.readLine();
		System.out.println("empresa: ");
		lista_empresa[0] = bufEntrada.readLine();
		while (val==0) {
			System.out.println("Numero de Contacto: ");
			num = bufEntrada.readLine();
			if (num.length()==10) {
				lista_telefono[0] = num;
				val = 0;
			} else {
				System.out.println("Numero no valido. El numero debe ser de 10 digitos ");
				val = 0;
				contador = 0;
			}
		}
	}

	public static void vercontacto(String lista_nombre[], String lista_telefono[], String lista_empresa[], SIN_TIPO i) {
		int j;
		j = 1;
		for (j=1;j<=1;j++) {
			if (!lista_telefono[j-1].equals("0")) {
				System.out.println(" "+lista_nombre[j-1]);
				System.out.println(lista_telefono[j-1]);
				System.out.println(lista_empresa[j-1]);
			}
		}
	}

	public static void eliminarcontacto(String lista_nombre[], String lista_telefono[], String lista_empresa[], double i) throws IOException {
		int j;
		String num;
		j = 0;
		System.out.println("Numero de Contacto: ");
		num = bufEntrada.readLine();
		for (j=0;j<=i-1;j++) {
			if ((lista_telefono[j-1].equals(num))) {
				lista_nombre[j-1] = "0";
				lista_telefono[j-1] = "0";
				lista_empresa[j-1] = "0";
			}
		}
	}


}

