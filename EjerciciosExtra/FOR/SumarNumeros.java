package EjerciciosExtra.FOR;

public class SumarNumeros {
    public static void main(String[] args) {
        //Escribe un programa que sume todos los numeros del 1 al 100
        //usando un for y muestre el resultado
        int suma = 0;
        for(int i = 1; i<=100;i++){
            suma += i;
        }
        System.out.println("El resultado de la suma es : "+suma);
    }
}
