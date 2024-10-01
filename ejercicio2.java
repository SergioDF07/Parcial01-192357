import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese una cadena de texto");
        String texto = scanner.nextLine();
        texto = texto.trim().replaceAll("//s", " ");
        String[] palabras = texto.split(" ");
        System.out.println("el texto contiene " + palabras.length + " palabras.");
    }
}