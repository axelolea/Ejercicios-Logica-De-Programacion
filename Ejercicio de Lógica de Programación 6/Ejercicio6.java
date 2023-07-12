import java.util.Scanner;

public class Ejercicio6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingresa el texto a invertir: ");

        String value = Ejercicio6.sc.nextLine();

        String newText = "";
        char letter;

        for(int i = 0; i < value.length(); i++){
            letter = value.charAt(i);
            newText = letter + newText;
        }

        System.out.println(newText);
        
    }
}
