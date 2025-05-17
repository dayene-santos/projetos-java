package br.com.dayene.agendapessoal.view;

import br.com.dayene.agendapessoal.model.Tarefa;
import br.com.dayene.agendapessoal.service.AgendaService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private AgendaService agendaService = new AgendaService();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== MENU AGENDA PESSOAL ===");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    concluirTarefa();
                    break;
                case 4:
                    removerTarefa();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saindo da agenda...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void adicionarTarefa() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Data (ex: 2025-05-20): ");
        String data = scanner.nextLine();

        System.out.print("Prioridade (baixa, média, alta): ");
        String prioridade = scanner.nextLine();

        agendaService.adicionarTarefa(titulo, descricao, data, prioridade);
        System.out.println("Tarefa adicionada com sucesso!");
    }

        private void listarTarefas () {
            List<Tarefa> tarefas = agendaService.listarTarefas();

            if (tarefas.isEmpty()) {
                System.out.println("Nenhuma tarefa cadastrada.");
            } else {
                for (Tarefa tarefa : tarefas) {
                    System.out.println(tarefa);
                    System.out.println("------------------------");
                }
            }
        }
        private void concluirTarefa () {
            System.out.print("ID da tarefa que deseja concluir: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            boolean sucesso = agendaService.concluirTarefa(id);

            if (sucesso) {
                System.out.println("Tarefa marcada como concluída!");
            } else {
                System.out.println("Tarefa não encontrada ou já estava concluída.");
            }
        }
        private void removerTarefa () {
            System.out.print("ID da tarefa que deseja remover: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            boolean sucesso = agendaService.removerTarefa(id);

            if (sucesso) {
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Tarefa não encontrada.");
            }
        }

    }