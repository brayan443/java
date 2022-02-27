/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo1;

/**
 *
 * @author braya
 */
public class Ciclo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador,espacios,c_espacios;
        String signo,tab;
	contador=0;
	signo="*  ";
	espacios=1;
	c_espacios=1;
	tab=" ";
	       System.out.println("*"); 
	for (int i=1;i<=1;i++) {
            while(contador<=i){
                 System.out.println(signo+"*");
			contador+=1;
            }
            while(c_espacios<=espacios){
                System.out.println(tab+" ");
			c_espacios=c_espacios+1;
            }
            System.out.println(tab+signo);
		contador-=1;
		espacios-=1;
		c_espacios=1;
		tab=" ";
        }
	 
    }
    
}
