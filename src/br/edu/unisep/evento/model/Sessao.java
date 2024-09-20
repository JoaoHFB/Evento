package br.edu.unisep.evento.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sessao {
    private int id;
    private String nome;
    private String descricao;
    private Calendar horario;
    private Palestrante palestrante;
    private Participante participante;

    public Sessao() {
    }

    public Sessao(int id, String nome, String descricao, Calendar horario, Palestrante palestrante, Participante participante) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.horario = horario;
        this.palestrante = palestrante;
        this.participante = participante;
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

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return "Sessao{" +
                "id=" + id + "\n" +
                ", nome='" + nome + '\'' + "\n" +
                ", descricao='" + descricao + '\'' + "\n" +
                ", horario=" + sdf.format(horario.getTime()) + "\n" +
                ", palestrante=" + palestrante + "\n" +
                ", participante=" + participante + "\n" +
                '}';
    }
}
