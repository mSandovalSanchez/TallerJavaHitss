package sintaxis;

public class Operadores {
    public static void main(String[] args) {
        //Operadores aritmeticos
        int a = 13, b = 5;
        double c = 5.4;
        System.out.println("Suma : "+(a+b));
        System.out.println("Resta : "+ (a-b));
        System.out.println("Multiplicacion  : "+ a*b);
        System.out.println("Division: " + a/b);
        System.out.println("Modulo: "+a%b);
        System.out.println("Expresion: "+(a+b*b/2%b-a));
        
        //Operadores de asignación
        a += b + 2;//a = a +2
        System.out.println(a);
        a -= 5; //a - a - 5
        a *= 2;//a = a * 2
        a /= b; //a = a /b;
        a %= 4; //a = a % 4
        System.out.println(a);

         //Operadores relaciones (comparacion)
         System.out.println("Igual :"+(a=b));
         System.out.println("");
         System.out.println("");
         System.out.println("");

         //Operadores logicos
          //AND(&&)
          //TRUE && TRUE = TRUE
          //TRUE && FALSE = FALSE
          //FALSE && TRUE = FALSE
          //FALSE // FALSE =  FALSE

          //OR
          //TRUE || TRUE = TRUE
          //TRUE || FALSE = TRUE
          //FALSE || TRUE = TRUE
          //FALSE || FALSE = FALSE
          
          //NOT(!)
          //-!true = false
          //-! false  = true
          System.out.println("AND: "+((a != b)&&(a <= b)));
          System.out.println("OR: "+((a != b)||(a >= b)));
          System.out.println("NOT: "+(!(a != b)));

          //Operadores ++ y 
          int x= 5, y=5;
          System.out.println("Pre incremento: "+(++x));//x = 6
          System.out.println("Post incremento: "+(x ++));// x= 6
          System.out.println("X: "+ x);//7
          System.out.println("Pre incremento: "+(--y));//x = 4
          System.out.println("Post incremento: "+(y--));// x= 4
          System.out.println("X: "+ y);//3

          
    }
}
