package br.senia.sp.jandira.Model;

import javax.sound.midi.Soundbank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private  String servidor, banco, user, password;

    public Connection conexao;

    public Conexao(){
        this.servidor = "localhost";
        this.banco = "db_senai_jandira";
        this.user = "root";
        this.password = "bcd127";
    }
     public void connectDriver(){
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://"  + this.servidor + "/" + this.banco, this.user, this.password  );

        } catch (SQLException erro){
            System.out.println(erro);
        }
    }

    public Connection getConnertion(){
        connectDriver();
        return conexao;
    }


}
