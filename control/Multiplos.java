package control;

public class Multiplos {
    public static void main(String[] args) {
        //Comprobar si el numero dado es multiplo de 3 o 5 o de ambos
        //10 -> multiplo 5
        //12 -> multiplo 3
        //15 -> multiplo de 3 y 5
        int numero = 20;
        if (numero % 3 == 0 && numero % 5 == 0){
            System.out.println("El numero "+numero+" es multiplo de 5 y 3");
        }else if(numero % 3 == 0){
            System.out.println("El numero "+numero+" es multiplo de  3");
        }else if(numero % 5 == 0){
            System.out.println("El numero "+numero+" es multiplo de  5");
        }else{
            System.out.println("El numero "+numero+" no es multiplo de 3 o 5");
        }
        System.out.println("Fin del programa ");

    }
}
