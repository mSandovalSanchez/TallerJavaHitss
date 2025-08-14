package entrada;
import java.util.Scanner;
public class ManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String nom1,nom2,nom3,newNom1,newNom2,newNom3;

        System.out.println("Ingresa el primer nombre : ");
        nom1 = scanner.nextLine();
        newNom1= nom1.toUpperCase();
        nom1.trim();//Omitir espacios
        System.out.println("Ingresa el segundo nombre : ");
        nom2 = scanner.nextLine();
        System.out.println("Nombre");
        newNom2 = nom2.toUpperCase();
        System.out.println("Ingresa el tercer nombre : ");
        nom3 = scanner.nextLine();
        newNom3 = nom3.toUpperCase();
        
        System.out.println("RESULTADO");
        System.out.print(newNom1.charAt(1)+"."+nom1.substring(nom1.length()-2)+"_");
        System.out.print(newNom2.charAt(1)+"."+nom2.substring(nom2.length()-2)+"_");
        System.out.print(newNom3.charAt(1)+"."+nom3.substring(nom3.length()-2)+"_");
        
        System.out.println("RESULTADO ALTERNATIVO");
        System.out.print(Character.toUpperCase(nom1.charAt(1))+"."+nom1.substring(nom1.length() - 2).toLowerCase()+"_");
        System.out.print(Character.toUpperCase(nom2.charAt(1))+"."+nom2.substring(nom2.length() - 2).toLowerCase()+"_");
        System.out.print(Character.toUpperCase(nom3.charAt(1))+"."+nom3.substring(nom3.length() - 2).toLowerCase()+"_");
    }
        
}
