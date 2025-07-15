
import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args) {

       // 4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

        String name1 = null;
        String name2 = null;
        Integer year1 = null;
        Integer year2 = null;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        name1 = leitor.nextLine();
        System.out.printf("Qual é a sua Idade? Sr. %s \n", name1);
        year1 = leitor.nextInt();
        leitor.nextLine(); // Isso sereve para LImpar o leitor e ele não dar erro e começar a pular a pergunda do segundo nome.

        System.out.println("Digite o nome da segunda pessoa: ");
        name2 = leitor.nextLine();
        System.out.printf("Agora digite o a sua Idade Sr. %s \n", name2);
        year2 = leitor.nextInt();

        int diferenciadeidade = year1 - year2;

        System.out.printf("A diferende de Idade Entre o Sr. %s e o Sr. %s é de: %s \n", name1, name2, diferenciadeidade);


    }
}
