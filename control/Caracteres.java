package control;

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        //Saber si un caracter dado por el usuario, 
        //Es una letra  (decir si es vocal o consonante)
        //un numero o un caracter especial

        Scanner entrada = new Scanner(System.in);
        char caracter;
        System.out.println("Caracter: ");
        caracter = entrada.next().charAt(0);
        if(Character.isLetter(caracter)){
            //Si es vocal o consonate
            char c = Character.toLowerCase(caracter);
            if (c == 'a' || c== 'e' || c=='i'|| c=='o'||c=='u'){
                System.out.println("El caracter "+caracter + " es una vocal");
           }else{
                 System.out.println("El caracter "+caracter+" es una consonate ");
           }
            //switch (c) {
              //  case  -> 'a','e','i','o','u' 
                //System.out.println("El caracter "+caracter + " es una vocal");
                  //  default ->
                    //System.out.println("El caracter "+caracter+" es una consonate ");
            //}
        }else if(Character.isDigit(caracter)){
              System.out.println("El caracter "+caracter +" es un caracter un numero. ");

                  }else{
                      System.out.println("El caracter "+caracter +" es un caracter especial. ");

        }
    }
}
