package ciclos;

import java.util.Scanner;

public class DesafioMinimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuantos numeros vas a ingresar (MINIMO 10))");
        int n = entrada.nextInt();

        if(n > 10 ){
            System.out.println("Debes ingresar al menos 10 números");
            entrada.close();
            return;
        }
        System.out.println("Ingresa el numero 1: ");
        int menor = entrada.nextInt();

        for(int i = 2; i<=n; i++){
            System.out.println("El numero menor ingresado es:"+menor);
            if(menor < 10){
                System.out.println("El numero menor menor que 10");
            }else{
                System.out.println("El numero menor es igual o mayor que 10");
            }
            entrada.close();
        }

    }
}
