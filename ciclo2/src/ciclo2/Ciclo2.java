/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo2;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ciclo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int filas,columnas,i,j;
        String simbolo;
        System.out.println( "Ingrese la cantidad de fila");
	 filas=entrada.nextInt();
         System.out.println( "Ingrese la cantidad de columnas");
	 columnas=entrada.nextInt();
	       System.out.println( "Ingrese simbolo");
	simbolo=entrada.next();
	       System.out.println("La figura es: "+simbolo);
	i=1;
	while(i<=filas){
		j=1;
	while(j<=columnas) {
		          System.out.println(simbolo+" ");
		j+=1;
        }
	           System.out.println(" ");
	i+=1;
    }
    
}}
