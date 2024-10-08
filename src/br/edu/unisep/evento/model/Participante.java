package br.edu.unisep.evento.model;

public class Participante {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String rg;

    public Participante() {
    }

    public Participante(int id, String nome, String cpf, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id + "\n" +
                ", nome='" + nome + '\'' + "\n" +
                ", cpf='" + cpf + '\'' + "\n" +
                ", telefone='" + telefone + '\'' + "\n" +
                ", email='" + email + '\'' + "\n" +
                ", rg='" + rg + '\'' + "\n" +
                '}';
    }
}
