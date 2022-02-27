/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ciclo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner(System.in);
    int a,b,c,n;
	       System.out.println("escribe un numero");
	 n=entrada.nextInt();
	for (a=1;a<=n;a--){
            for(b=1;b<=a;b++){
                    System.out.println(" ");
                }
        }
        
        for (c=a;c<=n;c++){
            System.out.println("*  ");
        }
		
		      System.out.println(""+c);
		
    }
    
}
