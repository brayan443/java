/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglo3;

/**
 *
 * @author BRAYAN
 */
public class Arreglo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
int a=0;
for(int i=0;i<=1000;i++){
if(i%i==0){
a++;
}
}
if(a==2){
System.out.println("es primo");
}
    }

}
