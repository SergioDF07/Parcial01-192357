
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero");
        String numero = scanner.nextLine();
        int cantidadDigitos = numero.length();
        
        System.out.println("el numero tiene " + cantidadDigitos + " digitos.");
    }
}