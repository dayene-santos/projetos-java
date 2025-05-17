package br.com.dayene.agendapessoal.model;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private String data;
    private String prioridade;
    private boolean concluida;

    // Construtor
    public Tarefa(int id, String titulo, String descricao, String data, String prioridade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.prioridade = prioridade;
        this.concluida = false; // Por padrão, a tarefa começa não concluída
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    // Método para marcar tarefa como concluída
    public void marcarComoConcluida() {
        this.concluida = true;
    }

    // Sobrescreve toString para exibir as informações da tarefa
    @Override
    public String toString() {
        return "Tarefa ID: " + id + "\n" +
                "Título: " + titulo + "\n" +
                "Descrição: " + descricao + "\n" +
                "Data: " + data + "\n" +
                "Prioridade: " + prioridade + "\n" +
                "Concluída: " + (concluida ? "Sim" : "Não") + "\n";
    }
}