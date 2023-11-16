package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaFisicaRepo implements Serializable {
    private List<PessoaFisica> listaPessoasFisicas;

    public PessoaFisicaRepo() {
        this.listaPessoasFisicas = new ArrayList<>();
    }

    public void inserir(PessoaFisica pessoa) {
        listaPessoasFisicas.add(pessoa);
    }

    public void alterar(PessoaFisica pessoa) {
        // Implemente a lógica de alteração conforme necessário
    }

    public void excluir(int id) {
        // Implemente a lógica de exclusão conforme necessário
    }

    public PessoaFisica obter(int id) {
        // Implemente a lógica de obtenção conforme necessário
        return null;
    }

    public List<PessoaFisica> obterTodos() {
        return listaPessoasFisicas;
    }

    public void persistir(String nomeArquivo) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            outputStream.writeObject(listaPessoasFisicas);
        }
    }

    public void recuperar(String nomeArquivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            listaPessoasFisicas = (List<PessoaFisica>) inputStream.readObject();
        }
    }
}

