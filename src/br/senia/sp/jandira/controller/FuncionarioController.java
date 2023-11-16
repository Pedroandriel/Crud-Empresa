package br.senia.sp.jandira.controller;

import br.senia.sp.jandira.Model.Conexao;
import br.senia.sp.jandira.Model.Funcionario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FuncionarioController {

    Conexao conexao = new Conexao();
    Connection objConnection = conexao.getConnertion();

    public void cadastrarFuncionario(Funcionario newFuncionario) throws SQLException {
        Statement statement = objConnection.createStatement();
        String queryCadastro = "INSERT INTO funcionario (idFuncionario, " +
                "nome, sobrenome, matricula, permissap, departamento_FK) values (" +
                newFuncionario.getIdFuncionario() + ",'" + newFuncionario.getNome() +
                "','" + newFuncionario.getSobrenome() + "','" + newFuncionario.getMatricula() +
                "'," + newFuncionario.getPermissap() + "," + newFuncionario.getDepartamento_Fk() +
                ")";

        statement.executeUpdate(queryCadastro);
        System.out.println("Usuário Cadastro com Sucesso !!!!");

    }


    public void listarFuncionarios() throws SQLException {
        Statement statement = objConnection.createStatement();

        String queryConsulta = "SELECT * FROM funcionario";

        ResultSet resultSet = statement.executeQuery(queryConsulta);


        Funcionario funcionario = new Funcionario();
        while (resultSet.next()){
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setIdFuncionario(resultSet.getInt("idfuncionario"));
            funcionario.setSobrenome(resultSet.getString("Sobrenome"));
            funcionario.setPermissap(resultSet.getInt("Permissap"));
            funcionario.setMatricula(resultSet.getString("Matricula"));
            // no banco de dados, Departamento está escrito com a letra D minúscula
            funcionario.setDepartamento_Fk(resultSet.getInt("departamento_Fk"));

            System.out.println(funcionario.getIdFuncionario());
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getSobrenome());
            System.out.println(funcionario.getMatricula());
            System.out.println(".*.**.*.*.*.*.**.*.*.*.*.*.*..*");


        }
    }

    public void deletarFuncionario(String nome) throws SQLException {
        System.out.println("Deletar" + nome + "...");

        Statement statement = objConnection.createStatement();

        String queryDelete = "DELETE FROM funcionario WHERE nome = '" + nome + "'";

        statement.executeUpdate(queryDelete);

        try {
            statement.executeUpdate(queryDelete);
            System.out.println("Usuario" + nome + "deletado com sucesso");
        }catch (Exception erro){
            System.out.println(erro);
        }


    }


    public void consultarfuncionario(String nome) throws SQLException {
        Statement statement = objConnection.createStatement();

        String queryPesquisa = "SELECT * FROM funcionario WHERE nome ='" + nome + "'";

        ResultSet resultSet = statement.executeQuery(queryPesquisa);

        Funcionario funcionario = new Funcionario();

        while (resultSet.next()){
            funcionario.setIdFuncionario(resultSet.getInt("idfuncionario"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setSobrenome(resultSet.getString("sobrenome"));
            // se estourar um erro talvez seja pelo motivo do idFuncionario pelo nome estar com o Funcionario Maiúscula
            System.out.println(funcionario.getIdFuncionario());
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getSobrenome());
            System.out.println("-/-/-/----------------------------/-/-/-//-/--/-/-/-/");

        }
    }











}
