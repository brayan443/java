/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional9;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Condicional9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        int cuenta,dni,saldo=0,monto,retiro,deposito,opcion;
        String usuario;
           System.out.println("Ingrese número de cuenta");
            cuenta=entrada.nextInt();
            System.out.println("Ingrese monto");
            deposito=entrada.nextInt();
             if(deposito>=10){
                 System.out.println("transaccion exitosa");
        }
             else {
                 System.out.println("ingrese monto correcto");
             }
             saldo+=deposito;
        
        System.out.println(" 1.Retiro \n 2.Consultar saldo");
        opcion=entrada.nextInt();
        
        if(opcion==1){
            System.out.println("Ingrese número de cuenta");
            cuenta=entrada.nextInt();
            System.out.println("Ingrese cantidad que desee retirar");
            retiro=entrada.nextInt();
            if(retiro<=saldo){
                System.out.println("Retiro exitoso");
                saldo-=retiro;
                        }
            else{
                System.out.println("no cuentas con los fondos suficientes");
            }
        }
        else if(opcion==2){
            System.out.println("Ingrese número de cuenta");
            cuenta=entrada.nextInt();
            System.out.println("usuario de la cuenta # "+cuenta+" su saldo es: "+saldo);
        }
    }
    
}
