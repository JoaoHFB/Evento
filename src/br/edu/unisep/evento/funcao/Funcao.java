package br.edu.unisep.evento.funcao;

import br.edu.unisep.evento.model.*;

import javax.swing.*;
import java.util.Calendar;

public class Funcao {
    public Evento adicionarevento(){
        int idevento =Integer.parseInt(JOptionPane.showInputDialog("Digite um ID"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String descricao = JOptionPane.showInputDialog("Digite o descricao");
        Calendar horario = Calendar.getInstance();
        String tipo = JOptionPane.showInputDialog("Digite o tipo");
        String local = JOptionPane.showInputDialog("Digite o local");

        Evento evento = new Evento();
        evento.setId(idevento);
        evento.setNome(nome);
        evento.setDescricao(descricao);
        evento.setHorario(horario);
        evento.setTipo(tipo);
        evento.setLocal(local);
        evento.setSessao(adicionarSessao());
        evento.setInscricao(adicionarIncricao());
        JOptionPane.showMessageDialog(null, evento);

        return evento;
    }
    public Sessao adicionarSessao(){
        int idsessao =Integer.parseInt(JOptionPane.showInputDialog("Digite um ID"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String descricao = JOptionPane.showInputDialog("Digite o descricao");
        Calendar horario = Calendar.getInstance();

        Sessao sessao = new Sessao();

        sessao.setId(idsessao);
        sessao.setNome(nome);
        sessao.setDescricao(descricao);
        sessao.setHorario(horario);
        sessao.setPalestrante(adicionarPalestrante());
        sessao.setParticipante(adicionarParticipante());

        return sessao;
    }
    public Participante adicionarParticipante(){
        int idparticipante =Integer.parseInt(JOptionPane.showInputDialog("Digite um ID"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String cpf = JOptionPane.showInputDialog("Digite o cpf");
        String email = JOptionPane.showInputDialog("Digite o email");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String rg = JOptionPane.showInputDialog("Digite o rg");

        Participante participante = new Participante();
        participante.setId(idparticipante);
        participante.setNome(nome);
        participante.setCpf(cpf);
        participante.setEmail(email);
        participante.setTelefone(telefone);
        participante.setRg(rg);

        return participante;
    }
    public Palestrante adicionarPalestrante(){
        int idpalestrante = Integer.parseInt(JOptionPane.showInputDialog("Digite um ID"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String cpf = JOptionPane.showInputDialog(("Digite o cpf"));
        String email = JOptionPane.showInputDialog("Digite o email");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String rg = JOptionPane.showInputDialog("Digite o rg");
        String endereco = JOptionPane.showInputDialog(("Digite o endereco"));
        String biografia = JOptionPane.showInputDialog("Digite o biografia");

        Palestrante palestrante = new Palestrante();
        palestrante.setId(idpalestrante);
        palestrante.setNome(nome);
        palestrante.setCpf(cpf);
        palestrante.setEmail(email);
        palestrante.setTelefone(telefone);
        palestrante.setRg(rg);
        palestrante.setEndereco(endereco);
        palestrante.setBiografia(biografia);
        return palestrante;
    }
    public Inscricao adicionarIncricao(){
        int idinscricao = Integer.parseInt(JOptionPane.showInputDialog("Digite um Id"));

        Inscricao inscricao = new Inscricao();
        inscricao.setId(idinscricao);
        inscricao.setParticipante(adicionarParticipante());
        inscricao.setSessao(adicionarSessao());
        return inscricao;
    }


}
