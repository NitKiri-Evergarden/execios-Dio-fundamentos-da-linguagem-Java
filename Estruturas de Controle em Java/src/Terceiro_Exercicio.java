import java.util.Scanner;

public class Terceiro_Exercicio {
    public static void main(String[] args) {

       /* 3. Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro
        e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou
        ímpares(de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e
        em ordem decrescente;
        */

        Integer number1 = null;
        Integer number2 = null;
        String decisao = null;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um Numero:");
        number1 = leitor.nextInt();
        System.out.println("Informe um Segundo Numero que Seja Maior do que o Primeiro numero informado enteriomente: ");
        number2 = leitor.nextInt();

        System.out.println("Você quer ver os números 'Par' ou 'Impar'?");
        decisao = leitor.next();

        System.out.printf("Os números %s entre %s e %s são:\n", decisao, number1, number2);

        for(int i = number2; i >= number1; i--){
            if (decisao.equalsIgnoreCase("par") &&  i % 2 == 0 ){
                System.out.print(i + " ");
            }
            else if (decisao.equalsIgnoreCase("impar") && i % 2 != 0){
                System.out.print(i + " ");
            }

        }
    }
}