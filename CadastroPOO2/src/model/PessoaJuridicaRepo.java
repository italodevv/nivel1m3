package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaJuridicaRepo implements Serializable {
    private List<PessoaJuridica> listaPessoasJuridicas;

    public PessoaJuridicaRepo() {
        this.listaPessoasJuridicas = new ArrayList<>();
    }

    public void inserir(PessoaJuridica pessoa) {
        listaPessoasJuridicas.add(pessoa);
    }

    public void alterar(PessoaJuridica pessoa) {
        // Implemente a lógica de alteração conforme necessário
    }

    public void excluir(int id) {
        // Implemente a lógica de exclusão conforme necessário
    }

    public PessoaJuridica obter(int id) {
        // Implemente a lógica de obtenção conforme necessário
        return null;
    }

    public List<PessoaJuridica> obterTodos() {
        return listaPessoasJuridicas;
    }

    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(listaPessoasJuridicas);
        }
    }

    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            listaPessoasJuridicas = (List<PessoaJuridica>) inputStream.readObject();
        }
    }
}

