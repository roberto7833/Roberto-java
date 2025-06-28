package br.ufpb.roberto.midias.midia;

public class Midia {
    private String titulo;
    private String genero;
    private int anoLancamento;
    private String descricao;
    private String [] elenco;
    private String diretor;

    public Midia(String titulo, String genero, int anoLancamento, String descricao, String [] elenco, String diretor){
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.descricao = descricao;
        this.elenco = elenco;
        this.diretor = diretor;
    }
}
