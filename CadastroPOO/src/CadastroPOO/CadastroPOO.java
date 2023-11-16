package CadastroPOO;

import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

import java.io.IOException;
import java.util.List;

public class CadastroPOO {
    public static void main(String[] args) {
        PessoaFisicaRepo repoPessoaFisica = new PessoaFisicaRepo();
        PessoaJuridicaRepo repoPessoaJuridica = new PessoaJuridicaRepo();

        // Adicionar várias pessoas físicas
        repoPessoaFisica.inserir(new PessoaFisica(1, "João", "123.456.789-00", 30));
        repoPessoaFisica.inserir(new PessoaFisica(2, "Maria", "987.654.321-00", 25));
        repoPessoaFisica.inserir(new PessoaFisica(3, "Pedro", "111.222.333-44", 35));

        try {
            repoPessoaFisica.persistir("pessoasFisicas.dat");
        } catch (IOException e) {
            System.err.println("Erro ao persistir dados de pessoas físicas: " + e.getMessage());
        }

        // Adicionar várias pessoas jurídicas
        repoPessoaJuridica.inserir(new PessoaJuridica(1, "Empresa A", "12345678901234"));
        repoPessoaJuridica.inserir(new PessoaJuridica(2, "Empresa B", "98765432109876"));
        repoPessoaJuridica.inserir(new PessoaJuridica(3, "Empresa C", "55555555555555"));

        try {
            repoPessoaJuridica.persistir("pessoasJuridicas.dat");
        } catch (IOException e) {
            System.err.println("Erro ao persistir dados de pessoas jurídicas: " + e.getMessage());
        }

        // Recuperar os dados de pessoas físicas do arquivo
        PessoaFisicaRepo repoPessoaFisicaRecuperado = new PessoaFisicaRepo();
        try {
            repoPessoaFisicaRecuperado.recuperar("pessoasFisicas.dat");
            List<PessoaFisica> pessoasFisicasRecuperadas = repoPessoaFisicaRecuperado.obterTodos();

            System.out.println("Pessoas Físicas recuperadas:");
            for (PessoaFisica pessoa : pessoasFisicasRecuperadas) {
                pessoa.exibir();
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao recuperar dados de pessoas físicas: " + e.getMessage());
        }

        // Recuperar os dados de pessoas jurídicas do arquivo
        PessoaJuridicaRepo repoPessoaJuridicaRecuperado = new PessoaJuridicaRepo();
        try {
            repoPessoaJuridicaRecuperado.recuperar("pessoasJuridicas.dat");
            List<PessoaJuridica> pessoasJuridicasRecuperadas = repoPessoaJuridicaRecuperado.obterTodos();

            System.out.println("Pessoas Jurídicas recuperadas:");
            for (PessoaJuridica empresa : pessoasJuridicasRecuperadas) {
                empresa.exibir();
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao recuperar dados de pessoas jurídicas: " + e.getMessage());
        }
    }
}

