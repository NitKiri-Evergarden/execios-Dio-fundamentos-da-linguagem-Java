import java.util.Scanner;

public class Segundo_Exercicio {
    public static void main(String[] args){

       /* 2. Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
        - Se for menor ou igual a 18,5 "Abaixo do peso";
        - se for entre 18,6 e 24,9 "Peso ideal";
        - Se for entre 25,0 e 29,9 "Levemente acima do peso";
        - Se for entre 30,0 e 34,9 "Obesidade Grau I";
        - Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
        - Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
        */

        Double altura = null;
        Integer peso = null;
        Scanner leitor = new Scanner(System.in);


        System.out.printf("Esecra sua Altura %s: e posteriomente o seu Peso %s: \n", altura, peso);
        altura = leitor.nextDouble();
        peso = leitor.nextInt();
        Double imc = peso/(altura * altura);
        int resultado = (int) Math.round(imc);

        System.out.printf("sua Altura é: %s, e seu Peso é: %s \n", altura, peso);
        System.out.println("seu IMC é: " + resultado);

        if (resultado <= 18){
            System.out.println("Você esta abaixo do peso");
        }
        else if (resultado >= 18 || resultado <= 24) System.out.println("Você esta no seu Peso ideal");
        else if (resultado >= 25 || resultado <= 29) System.out.println("Você esta Levemente acima do peso");
        else if (resultado >= 30 || resultado <= 34) System.out.println("Você com Obesidade Grau I");
        else if (resultado >= 35 || resultado <= 39) System.out.println("Você esta com Obesidade Grau II (Severa)");
        else if (resultado >= 40) System.out.println("Você esta com Obesidade III (Mórbida)");
    }
}
