
import java.util.Scanner;

public class SegundoExercicio {
    public static void main(String[] args) {

       /* 2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
        fórmula: área=lado X lado
        */

        Integer ladoquadrado = null;
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o lado do Quatrado: ");
        ladoquadrado = leitor.nextInt();

        int somararea = ladoquadrado * ladoquadrado;

        System.out.printf("A area do seu quadrado é: %s \n", somararea);
    }
}
