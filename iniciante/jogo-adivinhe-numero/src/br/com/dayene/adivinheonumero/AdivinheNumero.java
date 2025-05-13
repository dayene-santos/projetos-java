/* AdivinheNumero application
 *
 * @ author Dayene dos Santos
 * @ version 1.00 2025/05/13
 */
package br.com.dayene.adivinheonumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // Cria um objeto Random para gerar um número aleatório

        int aleatorio = random.nextInt(100) +1; // Gera um número aleatório entre 1 e 100
        int numero=0, tentativas=0;
        // loop que continua até o usuário acertar o número
        while(numero != aleatorio) {
            System.out.print("Adivinhe qual é o número: ");
            numero = sc.nextInt(); // lê o número digitado pelo usuário
            tentativas++; // incrementa o número de tentativas

            // Dá uma dica ao jogador: se o número digitado é maior ou menor que o sorteado
            if (numero > aleatorio){
                System.out.println("Alto"); // O número está acima do sorteado
            } else if(numero < aleatorio) {
                System.out.println("Baixo"); // o número está abaixo do sorteado
            }
        }

        // Mensagem de sucesso quando o número é adivinhado
        System.out.println("PARABÉNS, VOCÊ ACERTOU!!");
        System.out.println("O número sorteado foi: " + aleatorio); // imprime o número sorteado
        System.out.printf("Você acertou após %s tentativas!", tentativas); // imprime o número de tentativas

        sc.close();
    }
}
