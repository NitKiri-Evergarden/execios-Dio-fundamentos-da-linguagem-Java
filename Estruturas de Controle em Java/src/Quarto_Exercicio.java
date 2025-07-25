import java.util.Scanner;

public class Quarto_Exercicio {
    public static void main(String[] args){

        /*4. Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a
        execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto
        diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados */

        Integer numero1 = null;
        Integer numero2 = null;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um Número: ");
        numero1 = leitor.nextInt();

        for (;;){ // while (true), ao inves de for 
            System.out.println("Informe outro número: ");
            numero2 = leitor.nextInt();

            if ( numero2 == 0){
                System.out.println("Não é possível dividir por zero. Tente outro número.");
                continue;
            }

            for (int i = numero1; i <= numero2; i++){
                int resultado = i % numero1;
                if (resultado % 2 != 0){
                    System.out.printf("O Número %d Dividido Pelo Número %d tem o resto Diferente de 0, você chegou ao seu objetivo \n", numero1, numero2);
                    break;
                }
            }
        }

    }
}
