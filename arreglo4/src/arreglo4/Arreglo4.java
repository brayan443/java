/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo4;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Arreglo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
	int columna,fila,i,j;
	columna=5; fila=4;
	float datos[][]=new float[fila][columna];
        i=fila;j=columna;
	for(i=1;i<=fila;i++){
            for(j=1;j<=columna;i++){
                System.out.println("ingrese los datos de la fila: "+i+" columna: "+j);
                datos[i][j]=entrada.nextFloat();
            }
        }
        
		for(i=1;i<=fila;i++){
                    for(j=1;i<=columna;i++){
                        System.out.println("ingrese los datos de la fila: "+i+" columna: "+j);
                datos[i][j]=entrada.nextFloat();
                        System.out.println(datos[i][j]+" ");
                    }
                    
                    System.out.println(" ");
                }

    }
    
}
