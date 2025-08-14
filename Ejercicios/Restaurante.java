package Ejercicios;

import java.util.Scanner;
public class Restaurante {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double tventas = 0.0;
        String letra = "";

        while(!letra.equals("letra")){
            System.out.println("=========  M E N Ú =========");
            System.out.println("ELIGA UNA OPCIÓN (a-c)");
            System.out.println("a. Registrar pedido");
            System.out.println("b.Mostrar ventas");
            System.out.println("c.Salir");

            letra = entrada.nextLine();
        
            switch (letra) {
                case "a":
                    System.out.println("Ingresa el precio del pedido:");
                    String p = entrada.nextLine();

                    double dp= Double.parseDouble(p);
                    tventas = tventas + dp;
                    break;
                case "b":
                System.out.println("Total de ventas: "+tventas);
                break;
                default:
                System.out.println("Ingresa una letra valida");
                    break;
            }
        }
            entrada.close();
    }
}

