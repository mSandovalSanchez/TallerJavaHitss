package ciclos;

import java.util.Scanner;

public class EjerciciFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo numero:");
        int num2 = entrada.nextInt();

        int resultado = 0;
        boolean negativo =(num1<0) ^ (num2<0);

        int absB = Math.abs(num2);
        for (int i = 0; i < absB; i++){
            resultado += num1;
        }if(negativo){
            resultado= -resultado;
        }
        System.out.println("Resultado: "+resultado);
    }
}
