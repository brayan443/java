/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional5;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Condicional5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        boolean devolucion;
        String producto,estadoproducto;
        System.out.println("ingresa 1.compra de producto,2.consultar precio por producto,3.devoluciones");
        opcion=entrada.nextInt();
        if(opcion==1){
            System.out.println("escribe el nombre de tu producto");
            producto=entrada.next();
        }
        else if(opcion==2){
            System.out.println("Listado de precios de productos disponibles:" 
                    + "Naproxeno 500mg x 10 Precio $ 5.000"
		+"Acetaminofen 100mg x 10 precio $ 3.500");
        }
        else{
            System.out.println("Devolucion de productos");
            producto=entrada.next();
            System.out.println("¿Desea añadir un comentario? (true para si, false para no)");
            devolucion=entrada.nextBoolean();
            if (devolucion=true){
                System.out.println("añada un comentario");
                estadoproducto=entrada.next();
                System.out.println("la pelicula: "+producto+" novedad: "+estadoproducto);
                
            }
            
        }
    }
    }
    

