
import java.util.Scanner;

public class TerceiroExercicio {
    public static void main(String[] args){

        /*3. Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
        fórmula: área=base X altura
         */

        Integer base = null;
        Integer altura = null;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da Base do Retangulo: ");
        base = leitor.nextInt();

        System.out.println("Digite o valor da Area do Retangulo: ");
        altura = leitor.nextInt();

        int arearetangulo = base * altura;

        System.out.println("A Area do seu Retangulo é: " + arearetangulo);

    }
}
