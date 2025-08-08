import java.util.Scanner;

public class Desafio_de_Acesso_a_Biblioteca {
    public static void main(String[] args) {

       /* Desafio
        Uma biblioteca está implementando um sistema automatizado para liberar o acesso à área de livros raros. O sistema deve permitir a entrada apenas para visitantes autorizados e com idade mínima de 18 anos. Para isso, é necessário utilizar operadores lógicos, estruturas condicionais (if, else, else if) e conceitos básicos como tipos primitivos e palavras-chave. Desenvolva um programa que verifique se o visitante pode acessar a sala especial.

        Entrada
        O programa deve receber os seguintes valores:

        Um valor booleano indicando se o visitante possui autorização (true ou false)
        Um número inteiro representando a idade do visitante
                Saída
        Deverá retornar uma String com as mensagens:

        "Acesso permitido" se o usuário tiver permissão e for maior ou igual a 18 anos.
                "Acesso negado" se o usuário não tiver permissão.
        "Idade insuficiente" se o usuário tiver permissão, mas for menor de idade.
                Exemplos
        A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

        Entrada	Saída
        true
        20	Acesso permitido
        false
        25	Acesso negado
        true
        16	Idade insuficiente
        */

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        Boolean hasPermission = null; //scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        Integer age = null; //scanner.nextInt(); // Lê a idade como inteiro

        System.out.println("Você tem PERMISSÃO? ");
        hasPermission = scanner.nextBoolean();

        System.out.println("Qual a Sua Idade? ");
        age = scanner.nextInt();

        // TODO: Verifique condições de acesso
        for (int i = 0; age >= 18; i++) {
            if(hasPermission == true && age >=18){
                System.out.println("Você tem Permição para acessar a Biblioteca ");
                break;

            }else if (hasPermission == false && age >= 18){
                System.out.println("Você não tem Permissão, Porém tem a Idade minima para acessar a Biblioteca então: VÁ ATRÁS DA SUA PERMICÃO ");
                break;

            }else if (hasPermission == false && age <= 17){
                System.out.println("Você não tem Permissão e nem Idade minima, volte quando possuir os dois ");

            }//else{
               // System.out.println("Você não tem Permissão e nem Idade minima, volte quando possuir os dois ");
            //}

            scanner.close();
        }
    }
}