import java.util.Stack;
import java.util.Scanner;

public class AutomatoPilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma cadeia composta por '0's e '1's: ");
        String input = scanner.nextLine();
        scanner.close();
        if (aceita(input)) {
            System.out.println("A cadeia foi aceita!");
        } else {
            System.out.println("A cadeia foi rejeitada.");
        }
    }

    public static boolean aceita(String input) {
        Stack<Character> pilha = new Stack<>();
        int i = 0;
        int tamanho = input.length();
        while (i < tamanho && input.charAt(i) == '0') {
            pilha.push('X');
            i++;
        }
        while (i < tamanho && input.charAt(i) == '1') {
            if (pilha.isEmpty()) {
                return false;
            }
            pilha.pop();
            i++;
        }
        if (i != tamanho) {
            return false;
        }
        return pilha.isEmpty();
    }
}
