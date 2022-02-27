/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo4;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ciclo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         int numero1,x;
        System.out.println("De que número desea la tabla de multiplicar?");
	numero1=entrada.nextInt();
	for( x=1;x<=10;x++){
            System.out.println(x+"x"+numero1+"="+x*numero1);
        }
    }
    
}
