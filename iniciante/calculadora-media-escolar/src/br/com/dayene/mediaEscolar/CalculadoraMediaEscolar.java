/* CalculadoraMediaEscolar application
 *
 * @ author Dayene dos Santos
 * @ version 1.00 2025/05/11
 */
package br.com.dayene.mediaEscolar;

import java.util.Scanner;

public class CalculadoraMediaEscolar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        String nome, disciplina;
        double nota1, nota2, nota3, media;

        // entrada de dados: nome
        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();

        // entrada de dados: nome da disciplina
        System.out.print("Digite Disciplina: ");
        disciplina = sc.nextLine();

        System.out.print("Digite a primeira nota: "); // recebe a primeira nota
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: "); // recebe a segunda nota
        nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: "); // recebe a terceira nota
        nota3 = sc.nextDouble();

        // calculo da média das notas
        media = (nota1 + nota2 + nota3) / 3;

        // Exibição dos dados e uso de printf para formatar notas com duas casas decimais
        System.out.println("\n---- RESULTADO ----");
        System.out.println("\nAluno: " + nome);
        System.out.println("Disciplina: " + disciplina);
        System.out.printf("Nota 1: %.2f\n", nota1);
        System.out.printf("Nota 2: %.2f\n", nota2);
        System.out.printf("Nota 3: %.2f\n", nota3);
        System.out.printf("\nMédia: %.2f\n", media);

        // verificação da média e exibição do resultado final
        if (media >= 7) {
            System.out.println("\nAprovado!!");
        } else if (media >= 5) {
            System.out.println("\nEm recuperação!");
        } else {
            System.out.println("\nReprovado");
        }

        sc.close();

    }
}
