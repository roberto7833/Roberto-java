package br.ufpb.roberto.midias.midia;

import java.io.*;
import java.util.HashMap;
import java.util.Objects;

public class GravadorDeDados {

    public static final String ARQUIVOS_MIDIAS = "Midias.dat";

    public HashMap<String, Midia> recuperarDados()throws IOException{
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVOS_MIDIAS))){
            return (HashMap<String, Midia>) in.readObject();
        }
        catch (ClassNotFoundException e){
            throw new IOException(e);
        }
    }
    public void salvarDados(HashMap<String, Midia> midias)throws IOException{
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVOS_MIDIAS))){
            out.writeObject(midias);
        }
        catch (IOException e){
            throw new IOException("Erro ao salvar dados"+ e.getMessage(), e);
        }
    }
}
