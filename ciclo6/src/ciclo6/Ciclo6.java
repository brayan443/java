/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo6;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Ciclo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
         String lista_nombre[]=new String[4];
	String lista_telefono[]=new String[4];
	String lista_empresa[]=new String[4];
	String nombre;
	int numer,op,i,dato,contador,k,aux,j;
	j=0;
	op=0;
	i=0;
	contador=0;
	k=0;
	inicializar{lista_nombre,lista_telefono,lista_empresa};
         System.out.println("1.crear contacto \n 2.ver contactos registrados \n 3.eliminar contacto");
	 op=entrada.nextInt();
	do
	    switch(op){
                case 1:{
                    for (j=0;j<=1;j++){
                        if(lista_telefono(j)=="0"){
                            contador+=1;
                            k=0;
                            j=3;
                            System.out.println("valor de k ="+k+" j="+j);
                        }
                    }
                    if(i<3 || contador>0){
                        aux=1;
                        i=k;
                        System.out.println("k="+k+"i="+i+"contador="+contador);
                        GuardarContacto(lista_nombre,lista_telefono,lista_empresa,i);
                        contador=0;
                        i=aux;
                        i+=1;
                        System.out.println("i="+i);
                    }}
                    case 2:{
                    System.out.println("i="+i);
                    VerContacto(lista_nombre,lista_telefono,lista_empresa,i);
                }
                    case 3:{
                        lista_nombrelista_telefonolista_empresa,i);
                    break;
                    }
                    while(op!=4)
                        }
        }
            
	