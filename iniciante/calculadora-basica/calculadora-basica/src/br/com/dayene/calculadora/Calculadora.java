package br.com.dayene.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        // Importando a classe Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Declarando as variáveis para armazenar os números e o resultado
        double num1, num2, resultado;
        char operador; // Variável para armazenar o operador escolhido pelo usuário
        String continuar;

        do {
            // Solicita ao usuário o primeiro número e armazena na variável num1
            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextDouble();  // Usa o método nextDouble() para ler números decimais

            // Solicita ao usuário o segundo número e armazena na variável num2
            System.out.print("Digite o segundo número: ");
            num2 = sc.nextDouble();  // Também usa o método nextDouble()

            // Pergunta ao usuário qual operação ele quer fazer (+, -, *, /)
            System.out.print("Qual operação você deseja fazer? (+, -, *, /) ");
            operador = sc.next().charAt(0);  // Lê o operador como um único caractere

            // Inicia uma estrutura switch para decidir qual operação será realizada com base no operador
            switch (operador) {
                case '+':  // Se o operador for "+", faz a soma
                    resultado = num1 + num2;
                    break;  // Sai do switch após realizar a operação
                case '-':  // Se o operador for "-", faz a subtração
                    resultado = num1 - num2;
                    break;  // Sai do switch
                case '*':  // Se o operador for "*", faz a multiplicação
                    resultado = num1 * num2;
                    break;  // Sai do switch
                case '/':  // Se o operador for "/", faz a divisão
                    // Verifica se o segundo número é diferente de 0 (para evitar erro de divisão por zero)
                    resultado = num2 != 0 ? num1 / num2 : 0;  // Se o segundo número for 0, a resposta será 0
                    break;  // Sai do switch
                default:  // Se o operador não for nenhum dos válidos (+, -, *, /), exibe uma mensagem de erro
                    System.out.println("Operador Inválido! Tente +, -, * ou /");
                    return;  // Finaliza o programa, sem continuar a execução
            }

            // Exibe o resultado da operação formatado com duas casas decimais
            System.out.printf("Resultado: %.2f %c %.2f = %.2f\n", num1, operador, num2, resultado);

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja fazer outro cálculo? ");
            continuar = sc.next();
        } while (continuar.equalsIgnoreCase("s")); // Se o usuário digitar 's' ou 'S', o loop continua

        // Fecha o Scanner após o uso para liberar os recursos
        sc.close();
    }
}
