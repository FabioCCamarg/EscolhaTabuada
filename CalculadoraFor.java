
package calculadorafor;

import java.util.Scanner;


public class CalculadoraFor {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("|--------------------------|");
        System.out.println("| Qual tabuada deseja ver? |");
        System.out.println("|--------------------------|");
        int tabuada = sc.nextInt();
        
        if (tabuada ==0){
            System.out.println("|-------------------------------------------|");
            System.out.println("| Nessa Tabuada, os resultados serão Nulos! |");
            System.out.println("|-------------------------------------------|");

        }
        for (int cont = 1; cont <=10;cont++){
            System.out.println(tabuada +" x "+ cont+" = "+(cont*tabuada));
            
        }
        
        
    }
    
}
