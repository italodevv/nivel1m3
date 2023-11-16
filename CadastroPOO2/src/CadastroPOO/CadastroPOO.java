package CadastroPOO;

import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CadastroPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaFisicaRepo repoPessoaFisica = new PessoaFisicaRepo();
        PessoaJuridicaRepo repoPessoaJuridica = new PessoaJuridicaRepo();

        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = lerOpcao(scanner);

            switch (opcao) {
                case 1:
                    incluirOpcao(repoPessoaFisica, repoPessoaJuridica, scanner);
                    break;
                case 2:
                    alterarOpcao(repoPessoaFisica, repoPessoaJuridica, scanner);
                    break;
                case 3:
                    excluirOpcao(repoPessoaFisica, repoPessoaJuridica, scanner);
                    break;
                case 4:
                    exibirPorIdOpcao(repoPessoaFisica, repoPessoaJuridica, scanner);
                    break;
                case 5:
                    exibirTodosOpcao(repoPessoaFisica, repoPessoaJuridica, scanner);
                    break;
                case 6:
                    salvarOpcao(repoPessoaFisica, repoPessoaJuridica, scanner);
                    break;
                case 7:
                    recuperarOpcao(repoPessoaFisica, repoPessoaJuridica, scanner);
                    break;
                case 8:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }

    // Métodos de operações do menu
    private static void incluirOpcao(PessoaFisicaRepo repoPessoaFisica, PessoaJuridicaRepo repoPessoaJuridica, Scanner scanner) {
        System.out.println("Escolha o tipo de pessoa (1 - Física, 2 - Jurídica):");
        int tipoPessoa = lerOpcao(scanner);

        if (tipoPessoa == 1) {
            System.out.println("Incluir Pessoa Física:");
            // Solicitar dados e adicionar no repositório de Pessoa Física
            try {
                System.out.println("Digite o ID:");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                System.out.println("Digite o nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite o CPF:");
                String cpf = scanner.nextLine();

                System.out.println("Digite a idade:");
                int idade = scanner.nextInt();

                repoPessoaFisica.inserir(new PessoaFisica(id, nome, cpf, idade));
                System.out.println("Pessoa Física adicionada com sucesso!");
            } catch (InputMismatchException e) {
                System.out.println("Erro ao ler os dados. Certifique-se de inserir os valores corretos.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        } else if (tipoPessoa == 2) {
            System.out.println("Incluir Pessoa Jurídica:");
            // Solicitar dados e adicionar no repositório de Pessoa Jurídica
            try {
                System.out.println("Digite o ID:");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                System.out.println("Digite o nome:");
                String nome = scanner.nextLine();

                System.out.println("Digite o CNPJ:");
                String cnpj = scanner.nextLine();

                repoPessoaJuridica.inserir(new PessoaJuridica(id, nome, cnpj));
                System.out.println("Pessoa Jurídica adicionada com sucesso!");
            } catch (InputMismatchException e) {
                System.out.println("Erro ao ler os dados. Certifique-se de inserir os valores corretos.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }

    private static void alterarOpcao(PessoaFisicaRepo repoPessoaFisica, PessoaJuridicaRepo repoPessoaJuridica, Scanner scanner) {
        System.out.println("Digite o tipo (1 - Pessoa Física, 2 - Pessoa Jurídica): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o ID da entidade a ser alterada: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (tipo == 1) {
            // Lógica para alterar Pessoa Física por ID
            // Receber novos dados e atualizar no repositório de Pessoa Física
        } else if (tipo == 2) {
            // Lógica para alterar Pessoa Jurídica por ID
            // Receber novos dados e atualizar no repositório de Pessoa Jurídica
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void excluirOpcao(PessoaFisicaRepo repoPessoaFisica, PessoaJuridicaRepo repoPessoaJuridica, Scanner scanner) {
        System.out.println("Digite o tipo (1 - Pessoa Física, 2 - Pessoa Jurídica): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o ID da entidade a ser excluída: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (tipo == 1) {
            // Lógica para excluir Pessoa Física por ID do repositório de Pessoa Física
        } else if (tipo == 2) {
            // Lógica para excluir Pessoa Jurídica por ID do repositório de Pessoa Jurídica
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void exibirPorIdOpcao(PessoaFisicaRepo repoPessoaFisica, PessoaJuridicaRepo repoPessoaJuridica, Scanner scanner) {
        System.out.println("Digite o tipo (1 - Pessoa Física, 2 - Pessoa Jurídica): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.println("Digite o ID da entidade a ser exibida: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (tipo == 1) {
            // Lógica para exibir Pessoa Física por ID do repositório de Pessoa Física
        } else if (tipo == 2) {
            // Lógica para exibir Pessoa Jurídica por ID do repositório de Pessoa Jurídica
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void exibirTodosOpcao(PessoaFisicaRepo repoPessoaFisica, PessoaJuridicaRepo repoPessoaJuridica, Scanner scanner) {
        System.out.println("Digite o tipo (1 - Pessoa Física, 2 - Pessoa Jurídica): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (tipo == 1) {
            // Lógica para exibir todas as Pessoa Física do repositório de Pessoa Física
        } else if (tipo == 2) {
            // Lógica para exibir todas as Pessoa Jurídica do repositório de Pessoa Jurídica
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void salvarOpcao(PessoaFisicaRepo repoPessoaFisica, PessoaJuridicaRepo repoPessoaJuridica, Scanner scanner) {
        // Lógica para salvar os dados dos repositórios em arquivos
    }

    private static void recuperarOpcao(PessoaFisicaRepo repoPessoaFisica, PessoaJuridicaRepo repoPessoaJuridica, Scanner scanner) {
        // Lógica para recuperar os dados dos arquivos para os repositórios
    }

    private static void exibirMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Incluir");
        System.out.println("2 - Alterar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Exibir por ID");
        System.out.println("5 - Exibir Todos");
        System.out.println("6 - Salvar");
        System.out.println("7 - Recuperar");
        System.out.println("8 - Sair");
    }

    private static int lerOpcao(Scanner scanner) {
        int opcao;
        while (true) {
            try {
                System.out.print("Opção: ");
                opcao = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número correspondente à opção desejada.");
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }
        return opcao;
    }
}
