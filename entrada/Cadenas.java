package entrada;

public class Cadenas {
    public static void main(String[] args) {
        String nombre1 = "Maria del Carmen Sandoval Sanchez";
        //index            
        String nombre2 = "Maria del hola Carmen Sandoval Sanchez";

        System.out.println("length(): "+nombre1.length());
        System.out.println("(==) : "+(nombre1 == nombre2));//No es recomendable en objetos
        System.out.println("equals(): "+nombre1.equals(nombre2));
        System.out.println("equalsIsIgnoreCase(String b): "+nombre1.equalsIgnoreCase(nombre2));

        System.out.println("nombre: "+nombre1);
        System.out.println("trim(): "+nombre1.trim());
        System.out.println("charAt(int i): "+ nombre2.charAt(2));
        System.out.println("charAt(int i): "+ nombre2.charAt(nombre2.length()-1));

        //SUBCADENAS 
        System.out.println("substring(int a, int b): "+ nombre2.substring(5, 12));
        System.out.println("substring(int i): "+nombre2.indexOf("hola"));

        System.out.println("lastIndexOf(String prefijo): "+ nombre2.startsWith("loy"));
        System.out.println("endsWith(String sufijo) :");
    }
    
}
