/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional4;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Condicional4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opcion;
        boolean comentario;
        String pelicula,novedad;
        System.out.println("ingresa 1.alquilar pelicula,2.consultar peliculas disponibles,3.recibir pelicula en la videotienda");
        opcion=entrada.nextInt();
        if(opcion==1){
            System.out.println("¿Que pelicula buscas?");
            pelicula=entrada.next();
        }
        else if(opcion==2){
            System.out.println("listado  de peliculas disponibles: Spiderman,Batman");
        }
        else{
            System.out.println("nombre de pelicula que regresa");
            pelicula=entrada.next();
            System.out.println("¿Desea añadir un comentario? (true para si, false para no)");
            comentario=entrada.nextBoolean();
            if (comentario=true){
                System.out.println("añada un comentario");
                novedad=entrada.next();
                System.out.println("la pelicula: "+pelicula+" novedad: "+novedad);
            }
            else
            {
                System.out.println("vuelva pronto");
            }
        }
    }
    
}
