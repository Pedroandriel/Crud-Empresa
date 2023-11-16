package br.senia.sp.jandira.controller;

import br.senia.sp.jandira.Model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    FuncionarioController funcionarioController = new FuncionarioController();

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        Scanner scanner  = new Scanner(System.in);

        while (continuar){
            System.out.println("*/**/*/*/*/*/ Bem vindo */*//*/*/*/*/*");
            System.out.println("+*+*+*+*++*+*++*+*+*+*+*+*+*+*+*++++*+");
            System.out.println("1- Cadastrar Funcionario"              );
            System.out.println("2- Listar Funcionario"                 );
            System.out.println("3- Deletar Funcionario"                );
            System.out.println("4- Consultar Funcionario"              );
            System.out.println("5- sair"                               );
            System.out.println("*/*/*/*//**/*/*/**/*//*/*/*/*/**/*/*/*");

            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){

                case 1:
                    Funcionario newFuncionario = new Funcionario();
                    newFuncionario.cadastrarFuncionario();
                    funcionarioController.cadastrarFuncionario(newFuncionario);
                    break;
                case 2:
                    System.out.println(" ---- Listar Funcionarios ----");
                    funcionarioController.listarFuncionarios();
                    break;
                case 3:
                    System.out.println(" Informe o nome do Ex-Funcionario");
                    String nomeDelete = scanner.nextLine();
                    funcionarioController.deletarFuncionario(nomeDelete);
                    break;
                case 4:
                    System.out.println("Informe o nome que deseja Pesquisar: ");
                    String nomePesquisado = scanner.nextLine();
                    funcionarioController.consultarfuncionario(nomePesquisado);
                    break;
                case 5:
                    continuar = false;
                    break;

            }
        }
    }
}
