import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra ou texto: ");
        String textoUsuario = scanner.nextLine();

        System.out.print("O total de vogais é: " + contador.contarVogais(textoUsuario));
    }
}