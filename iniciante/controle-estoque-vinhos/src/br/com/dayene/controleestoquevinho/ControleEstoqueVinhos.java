/* ControleEstoqueVinhos application
 *
 * @ autor Dayene dos Santos
 * @ version 1.0 2025/05/13
 */
package br.com.dayene.controleestoquevinho;

import java.util.Scanner;

public class ControleEstoqueVinhos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário o número de produtos a serem cadastrados
        System.out.print("Quantos produtos você irá cadastrar? ");
        int qtdeProdutos = sc.nextInt();

        // Declara e inicializa os arrays para armazenar os dados dos vinhos
        String[] nome = new String[qtdeProdutos]; // Nome de cada vinho
        String[] tipo = new String[qtdeProdutos]; // Tipo de cada vinho (Tinto, Branco, Rosé)
        double[] preco = new double[qtdeProdutos]; // Preço unitário de cada vinho
        double[] valorEstoque = new double[qtdeProdutos]; // Valor total em estoque (preço × quantidade)
        int[] qtdeVinhos = new int[qtdeProdutos]; // Quantidade em estoque de cada vinho
        int tinto = 0, branco = 0, rose = 0; // Variáveis para armazenar a quantidade total por tipo

        double valorEstoqueFinal = 0; // Variável para armazenar o valor total do estoque

        // Loop para entrada de dados de cada vinho
        for (int i = 0; i < qtdeProdutos; i++) {
            sc.nextLine(); // Consome a quebra de linha após nextInt()
            System.out.print("Nome do vinho: ");
            nome[i] = sc.nextLine(); // Lê o nome do vinho

            System.out.print("Tipo do Vinho (Tinto, Branco, Rosé): ");
            tipo[i] = sc.nextLine(); // Lê o tipo do vinho

            System.out.print("Quantidade a ser adicionada: ");
            qtdeVinhos[i] = sc.nextInt(); // Lê a quantidade

            // Contabiliza a quantidade de vinhos por tipo
            if (tipo[i].equalsIgnoreCase("Tinto")) {
                tinto += qtdeVinhos[i];
            } else if (tipo[i].equalsIgnoreCase("Branco")) {
                branco += qtdeVinhos[i];
            } else if (tipo[i].equalsIgnoreCase("Rosé")) {
                rose += qtdeVinhos[i];
            }

            System.out.print("Preço do vinho: ");
            preco[i] = sc.nextDouble(); // Lê o preço unitário

            // Calcula o valor total do vinho em estoque e acumula no total geral
            valorEstoque[i] = qtdeVinhos[i] * preco[i];
            valorEstoqueFinal += valorEstoque[i];
        }

        // Exibe o relatório detalhado de cada vinho
        System.out.println("----- RELATÓRIO FINAL -----");
        for (int i = 0; i < qtdeProdutos; i++) {

            System.out.println("Vinho: " + nome[i]);
            System.out.println("Tipo: " + tipo[i]);
            System.out.println("Quantidade Adicionada: " + qtdeVinhos[i]);
            System.out.printf("Preço Unitário: R$ %.2f\n", preco[i]);
            System.out.printf("Valor em Estoque: R$ %.2f\n", valorEstoque[i]);
            System.out.println("------------------------------------");

        }

        // Exibe o relatório geral com resumo por tipo e valor total
        System.out.println("----- RELATÓRIO GERAL -----");
        System.out.println("Total de Vinhos Adicionados: " + qtdeProdutos);
        System.out.println("Tinto: " + tinto + " unidades.");
        System.out.println("Branco: " + branco + " unidades.");
        System.out.println("Rosé: " + rose + " unidades.");
        System.out.printf("Valor Total do Estoque: R$ %.2f\n", valorEstoqueFinal);

        sc.close();
    }
}
