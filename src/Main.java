
import java.util.Scanner;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        /*
       1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

       2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
            fórmula: área=lado X lado

       3. Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela
            fórmula: área=base X altura

       4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas
         */


        //1. Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

        String name = null;
        int year = 0;
        int baseyear = OffsetDateTime.now().getYear();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        name = leitor.nextLine();

        System.out.println("Digite o seu Ano de nacimentro: ");
        year = leitor.nextInt();

        int age = baseyear - year;

        System.out.printf("Ola %s voce tem %s Anos \n", name, age);


    }
}