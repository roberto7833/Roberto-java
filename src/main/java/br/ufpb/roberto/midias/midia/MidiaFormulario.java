package br.ufpb.roberto.midias.midia;

import javax.swing.*;
import java.awt.*;

public class MidiaFormulario {
    public static  Midia midiaFormulario(){

        JTextField tituloField = new JTextField(10);
        JTextField generoField = new JTextField(10);
        JTextField anoField = new JTextField(4);
        JTextField descricaoField = new JTextField(20);
        JTextField elencoField = new JTextField(20);
        JTextField diretorField = new JTextField(10);

        JPanel panel = new JPanel(new GridLayout(0,1));
        panel.add(new JLabel("Titulo"));
        panel.add(tituloField);
        panel.add(new JLabel("Genero"));
        panel.add(generoField);
        panel.add(new JLabel("Ano de lançamento"));
        panel.add(anoField);
        panel.add(new JLabel("Descrição"));
        panel.add(descricaoField);
        panel.add(new JLabel("Elenco separado por virgula"));
        panel.add(elencoField);
        panel.add(new JLabel("Diretor"));
        panel.add(diretorField);

        int result = JOptionPane.showConfirmDialog(null, panel, "confirme os dados"
                ,JOptionPane.OK_CANCEL_OPTION
                ,JOptionPane.PLAIN_MESSAGE );

        if(result==JOptionPane.OK_OPTION){
            String titulo = tituloField.getText();
            String genero = generoField.getText();
            int ano = Integer.parseInt(anoField.getText());
            String descricao = descricaoField.getText();
            String [] elenco = elencoField.getText().split(",");
            String diretor = diretorField.getText();

            return new Midia(titulo, genero, ano, descricao, elenco, diretor);
        }
        return null;
    }
}
