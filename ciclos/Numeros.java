package ciclos;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        //Hacer la suma de numeros enteros mientras
        // el numero ingresado no sea 0 e imprimir la suma
       Scanner sc = new Scanner(System.in);
        int numero, suma = 0, total = 0;
        
        
        System.out.println("Ingresa un numero");
        numero = sc.nextInt();

        while (numero != 0 ) {
         suma += numero;   
         total++;
         System.out.println("Numero: ");
         numero = sc.nextInt(); 
        }
        if(total > 0){
            System.out.println("Promedio: "+suma / (double)total);
        }else{
            System.out.println("No hubo mensajes");
        }
        
        sc.close();
    }
}
