package EjerciciosExtra.FOR;

public class ForAnidados {
    
    public static void main(String[] args) {
        System.out.println("------ F E L I Z  N A V I D A D -----");
        int filas = 10;
        for(int i = 1; i <= filas;i++){
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    
}
