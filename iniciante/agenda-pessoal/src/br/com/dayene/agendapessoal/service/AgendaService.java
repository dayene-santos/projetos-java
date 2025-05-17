package br.com.dayene.agendapessoal.service;

import java.util.ArrayList;
import java.util.List;
import br.com.dayene.agendapessoal.model.Tarefa;

public class AgendaService {
    private List<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1; // Garante que cada tarefa tenha um ID único

    public void adicionarTarefa(String titulo, String descricao, String data, String prioridade) {
        Tarefa novaTarefa = new Tarefa(proximoId, titulo, descricao, data, prioridade);
        tarefas.add(novaTarefa);
        proximoId++;
    }

    public List<Tarefa> listarTarefas() {
        return tarefas;
    }

    public Tarefa buscarPorId(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getId() == id) {
                return tarefa;
            }
        }
        return null; // Não encontrada
    }

    public boolean removerTarefa(int id) {
        Tarefa tarefa = buscarPorId(id);
        if (tarefa != null) {
            return tarefas.remove(tarefa);
        }
        return false;
    }
    public boolean concluirTarefa(int id) {
        Tarefa tarefa = buscarPorId(id);
        if (tarefa != null && !tarefa.isConcluida()) {
            tarefa.marcarComoConcluida();
            return true;
        }
        return false;
    }

}
