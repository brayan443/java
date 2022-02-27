/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo2;

import java.util.Random;

/**
 *
 * @author braya
 */
public class Arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i,c;
    int arr[]=new int[20];
    for(i=0;i<=19;i++){
        Random x = new Random();
int num= x.nextInt(100);
        if(num%2==0){
            System.out.println(num+" numero par");
        }
        else{
            System.out.println(num+" numero impar");
        }
    }
    }
    
}
