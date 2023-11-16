package br.senia.sp.jandira;

import br.senia.sp.jandira.controller.Menu;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        menu.executarMenu();
    }
}
