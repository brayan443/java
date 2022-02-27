/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional8;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Condicional8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        int dni,opcion,cantidad,precio,total1,total2,total3,total4,contador;
        String cliente ;
        System.out.println("ingrese su nombre");
        cliente=entrada.next();
        System.out.println("ingrese su documento de identidad");
        dni=entrada.nextInt();
        System.out.println("elija una opcion\n 1.Torta 8 porciones vainilla \n 2.Torta 12 porciones vainilla \n 3.Torta 8 porciones chocolate \n 4.Torta 12 porciones chocolate \n 5.salir");
        opcion=entrada.nextInt();
        if(opcion==1){
            System.out.println("Ha elegido torta 8 porciones vainilla \n Ingrese cantidad");
           cantidad=entrada.nextInt();
            System.out.println("ingrese precio");
            precio=entrada.nextInt();
            total1=cantidad*precio;
            System.out.println("Hola"+cliente+" su pedido de 8 porciones vainilla es por: "+total1);
            
        }
         if(opcion==2){
            System.out.println("Ha elegido torta 12 porciones vainilla \n Ingrese cantidad");
           cantidad=entrada.nextInt();
            System.out.println("ingrese precio");
            precio=entrada.nextInt();
            total2=cantidad*precio;
            System.out.println("Hola"+cliente+" su pedido de 12 porciones vainilla es por: "+total2);
            
        }
            if(opcion==3){
            System.out.println("Ha elegido torta 8 porciones chocolate \n Ingrese cantidad");
           cantidad=entrada.nextInt();
            System.out.println("ingrese precio");
            precio=entrada.nextInt();
            total3=cantidad*precio;
            System.out.println("Hola"+cliente+" su pedido de 8 porciones chocolate es por: "+total3);
            
        }
             if(opcion==4){
            System.out.println("Ha elegido torta 12 porciones chocolate \n Ingrese cantidad");
           cantidad=entrada.nextInt();
            System.out.println("ingrese precio");
            precio=entrada.nextInt();
            total4=cantidad*precio;
            System.out.println("Hola"+cliente+" su pedido de 12 porciones chocolate es por: "+total4);
            
        }
              if(opcion==5){
            System.out.println("Datos incorrectos  \n Intente otra vez");
          
        }
        }
    }
    

