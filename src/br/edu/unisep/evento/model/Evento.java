package br.edu.unisep.evento.model;

import java.util.Calendar;

public class Evento {
    private int id;
    private String nome;
    private String descricao;
    private Calendar horario;
    private String tipo;
    private String local;
    private Sessao sessao;
    private Inscricao inscricao;

    public Evento() {
    }

    public Evento(int id, String nome, String descricao, Calendar horario, String tipo, String local, Sessao sessao, Inscricao inscricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.horario = horario;
        this.tipo = tipo;
        this.local = local;
        this.sessao = sessao;
        this.inscricao = inscricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Calendar getHorario() {
        return horario;
    }

    public void setHorario(Calendar horario) {
        this.horario = horario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", horario=" + horario +
                ", tipo='" + tipo + '\'' +
                ", local='" + local + '\'' +
                ", sessao=" + sessao +
                ", inscricao=" + inscricao +
                '}';
    }
}
