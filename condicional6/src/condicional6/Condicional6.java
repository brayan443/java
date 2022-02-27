/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional6;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Condicional6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int servicios;
        boolean inventariar;
        String usuario,placa,observacionCliente,producto,estadoproducto,novedadArreglos;
        System.out.println("ingresa 1.datos del dueño y moto,2.salida y arreglos");
        servicios=entrada.nextInt();
        if(servicios==1){
            System.out.println("escriba su nombre");
            usuario=entrada.next();
            System.out.println("escriba placa de la moto");
            placa=entrada.next();
            System.out.println("escriba observaciones de la moto");
            observacionCliente=entrada.next();
            System.out.println("El usuario: "+usuario+" de moto placa: "+placa+" indica las siguientes observaciones: "+observacionCliente);
        }
        else if(servicios==2){
            System.out.println("escriba productos utilizados para la reparación");
            producto=entrada.next();
            System.out.println("escriba novedad");
            novedadArreglos=entrada.next();
            System.out.println("¿Desea inventariar cambios repuestos? (true para si, false para no)");
            inventariar=entrada.nextBoolean();
            if(inventariar=true){
                System.out.println("Añada productos que se coloca y producto que se regresa a dueño en mal estado");
            estadoproducto=entrada.next();
                System.out.println("los productos son: "+producto+" novedad: los servicios prestados fueron: "+servicios);
            }
        }
       
            
        }
    }
    

