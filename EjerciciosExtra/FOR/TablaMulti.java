package EjerciciosExtra.FOR;
    //Escribe un programa que muestre la tabla de multiplicar el7 usando un for
public class TablaMulti {
    public static void main(String[] args) {
       int numero = 7;
       
       System.out.println("=====TABLA DE MULTIPLICAR======");
        for(int i=1;i<=10;i++){
            System.out.println(numero+" X "+i+" = "+(numero*i));
            
        }
    }
}
