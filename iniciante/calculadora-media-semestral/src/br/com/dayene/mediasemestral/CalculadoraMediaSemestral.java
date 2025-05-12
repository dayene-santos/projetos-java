/* CalculadoraMediaSemestral application
 *
 * @ author Dayene dos Santos
 * @ version 1.00 2025/05/12
 */
package br.com.dayene.mediasemestral;

import java.util.Scanner;

public class CalculadoraMediaSemestral {
    public static void main(String[] args) {

        //Criação do objeto Scanner para ler entradas do teclado.
        Scanner sc = new Scanner(System.in);

        int qtdeDisciplina;


        System.out.print("Quantas disciplinas serão avaliadas? ");
        qtdeDisciplina = sc.nextInt();

        String[] disciplinas = new String[qtdeDisciplina]; //Cria um array de Strings para armazenar o nome de cada disciplina.

        sc.nextLine(); //Consome a quebra de linha pendente deixada pelo nextInt(), evitando erro na leitura do próximo nextLine().

        double[] nota1 = new double[qtdeDisciplina]; // array de double para armazenar a primeira nota de cada disciplina
        double[] nota2 = new double[qtdeDisciplina]; // array de double para armazenar a segunda nota de cada disciplina
        double[] media = new double[qtdeDisciplina]; // array de double para armazenar a média obtida em cada disciplina

        //laço que irá preencher os dados necessários
        for (int i = 0; i < qtdeDisciplina; i++) {
            System.out.print("Disciplina: ");
            disciplinas[i] = sc.nextLine(); // Lê o nome da disciplina e guarda na posição correspondente do array disciplinas

            System.out.print("Nota 1: ");
            nota1[i] = sc.nextInt(); //  Lê a primeira nota da disciplina e guarda na posição correspondente do array disciplinas

            System.out.print("Nota 2: ");
            nota2[i] = sc.nextInt(); //  Lê a segunda nota da disciplina e guarda na posição correspondente do array disciplinas
            sc.nextLine(); // Novamente, limpa o buffer do teclado

            media[i] = (nota1[i] + nota2[i]) / 2; // Calcula a média entre as duas notas e armazena no array media.
        }
        // loop, agora para mostrar os resultados de cada disciplina.
        for (int i = 0; i < qtdeDisciplina; i++) {
            System.out.println("Disciplina: " + disciplinas[i]);
            System.out.printf("Primeira Nota: %.1f\n", nota1[i]);
            System.out.printf("Segunda Nota: %.1f\n", nota2[i]);
            System.out.printf("Média Final : %.1f\n", media[i]);

            // Avalia se a média é suficiente para aprovação (≥ 6) e imprime a mensagem correspondente
            if (media[i] >= 6) {
                System.out.println("Parabéns, você foi APROVADO!!!!");
            } else {
                System.out.println("Reprovado! Estude um pouco mais!!");
            }
            System.out.println("---------------");

        }
        sc.close();
    }
}
