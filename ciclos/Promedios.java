package ciclos;

import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        //Pedir 20 notas finales de alumnos en una escala del 1 al 10, manejar decimales en las notas
        //(double).Mostar el promedio de las notas mayores o iguales a 6, promedio de notas inferiores 
        //a 6 y la cantidad de notas iguales a 1, ademàs mostrar el promedio de notas inferiores a 6 y 
        //la cantidad 
        Scanner sc =new Scanner(System.in);
        double calificacion = 0,suma = 0, promedio;
       
        for( int i = 1 ; i <= 20 ;i++){
                System.out.println("Ingresa una calificacion: ");
                calificacion = sc.nextDouble();
                System.out.println(calificacion);
                suma += calificacion;

                if(calificacion <=6 ){
                    System.out.println("Calificacion menores o iguales 6: ");
                    
                }else if(calificacion>6){

                }else if(calificacion == 1){

                }
        }
        System.out.println("El promedio de las calificaciones es : "+( promedio = suma /20));
    }
}
