package br.ufpb.roberto.midias.midia;

import java.util.Objects;

public class Game {
    private String titulo;
    private String genero;
    private int anoLancamento;
    private String descricao;
    private String diretor;

    public Game(String titulo, String genero, int anoLancamento, String descricao, String diretor) {
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.descricao = descricao;
        this.diretor = diretor;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnoLancamento() {
        return this.anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDiretor() {
        return this.diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return anoLancamento == game.anoLancamento && Objects.equals(titulo, game.titulo) && Objects.equals(genero, game.genero);
    }
    @Override
    public int hashCode() {
        return Objects.hash(titulo, genero, anoLancamento);
    }
    @Override
    public String toString(){
        return "Filme "+this.titulo
                + "\nGenero "+this.genero+"\nLancado no ano " +this.anoLancamento
                +"\nDescricao"+this.descricao+"\nDiretor "+this.diretor;
    }
}
