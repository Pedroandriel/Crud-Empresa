package br.senia.sp.jandira.Model;

import java.util.Scanner;

public class Funcionario {

    private int idFuncionario, permissap, departamento_Fk;
    private  String nome, sobrenome, matricula;

    Scanner scanner = new Scanner(System.in);
    public void cadastrarFuncionario(){
        System.out.println("*/  Cadastrar Funcionario   /*");
        System.out.println("Informe o nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Informe o sobrenome: ");
        this.sobrenome = scanner.nextLine();
        System.out.println("Informe a Matricula: ");
        this.matricula = scanner.nextLine();
        System.out.println("Informe o Id do Funcionario (0)");
        this.idFuncionario = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe a permissap: ");
        this.permissap = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe o id do Departamento: ");
        this.departamento_Fk = scanner.nextInt();
        scanner.nextLine();
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getPermissap() {
        return permissap;
    }

    public void setPermissap(int permissap) {
        this.permissap = permissap;
    }

    public int getDepartamento_Fk() {
        return departamento_Fk;
    }

    public void setDepartamento_Fk(int departamento_Fk) {
        this.departamento_Fk = departamento_Fk;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
