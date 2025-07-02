package br.ufpb.roberto.midias.midia;

import java.util.List;

public class Serie extends Midia{
    private List<Episodio> episodios;

    public Serie(String titulo, String genero, int anoLancamento, String descricao, String [] elenco, String diretor, List<Episodio> episodios){
        super(titulo, genero, anoLancamento, descricao, elenco, diretor);
        this.episodios = episodios;
    }
    public List<Episodio> getEpisodios() {
        return this.episodios;
    }
    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }
    @Override
    public String toString(){
        return "Filme "+super.getTitulo()
                +"\nGenero "+super.getGenero()+"\nEpisodios "+this.episodios.size()
                +"\nLancado no ano " +super.getAnoLancamento()
                +"\nDescricao"+super.getDescricao()+"\nElenco "+String.join(",",super.getElenco())
                +"\nDiretor "+super.getDiretor();
    }
    public int somaEps(){
        int duracao=0;
        for(Episodio ep: this.episodios){
            duracao = ep.getDuracaoEp();
        }
        return duracao/episodios.size();
    }
}
