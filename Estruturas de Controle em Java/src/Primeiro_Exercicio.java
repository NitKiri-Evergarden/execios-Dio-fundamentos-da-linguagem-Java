import java.util.Scanner;

public class Primeiro_Exercicio {
    public static void main(String[] args) {

     /* 1. Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

        2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
        - Se for menor ou igual a 18,5 "Abaixo do peso";
        - se for entre 18,6 e 24,9 "Peso ideal";
        - Se for entre 25,0 e 29,9 "Levemente acima do peso";
        - Se for entre 30,0 e 34,9 "Obesidade Grau I";
        - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

        3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

        4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de  0 na divisão, números menores que o primeiro número devem ser ignorados */

        Scanner leitor = new Scanner(System.in);
        int numerodeentrada = 0;

        for(;;){
            System.out.println("Escreva o numero ao qual voce deseja que seja feita a tabuada, do respectivo numero: ");
            numerodeentrada = leitor.nextInt();

            for(int i = 1; i <= 10; i++) {
                int calculo = numerodeentrada * i;
                System.out.println(numerodeentrada + " x " + i + " = " + calculo);

            }
            if(numerodeentrada == 10){
                break;
                }
            else if(numerodeentrada == 1){
                break;
            }
            else if(numerodeentrada == 2) break;
            else if(numerodeentrada == 3) break;
            else if(numerodeentrada == 4) break;
            else if(numerodeentrada == 5) break;
            else if(numerodeentrada == 6) break;
            else if(numerodeentrada == 7) break;
            else if(numerodeentrada == 8) break;
            else if(numerodeentrada == 9) break;
        }
    }
}