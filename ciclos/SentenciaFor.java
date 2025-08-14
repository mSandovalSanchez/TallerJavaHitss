package ciclos;

public class SentenciaFor {
    public static void main(String[] args) {
        //Imprimir los numeros enteros del 1 al 10 secuencial
       int i;
        for(i = 1;i <= 10;++i){
            //break --> Termina o corta el flujo de las iteraciones
            //continue --> omite el valor que cumple la condicion
            if (i % 2 == 0) {
                System.out.println("Termino las iteraciones, con el valor de i :  "+i);
                continue;
            }
            System.out.println(i);
            //System.out.println(++i);

        }
    }
}
