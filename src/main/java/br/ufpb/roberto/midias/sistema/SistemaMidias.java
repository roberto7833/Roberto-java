package br.ufpb.roberto.midias.sistema;

import br.ufpb.roberto.midias.exception.MidiaJaExisteException;
import br.ufpb.roberto.midias.exception.MidiaNaoExisteException;
import br.ufpb.roberto.midias.midia.Game;
import br.ufpb.roberto.midias.midia.Midia;

import java.util.Collection;

public interface SistemaMidias {
    void cadastrarMidia(Midia midias)throws MidiaJaExisteException;
    void cadastrarGame(Game game)throws MidiaJaExisteException;
    Collection<Midia> pesquisarPorTitulo(String titulo);
    Collection<Midia> pesquisarPorGenero(String genero);
    Collection<Midia> pesquisarPorAnoLancamento(int ano);
    Collection<Midia> pesquisarPorAtor(String ator);
    Collection<Midia> pesquisarPorDiretor(String diretor);
    Collection<Midia> mostrarTodosOsFilmesCadastrados();
    Collection<Midia> mostrarTodasAsSeriesCadastradas();
    Collection<Midia> MostrarTodasAsMidiasCadastradas();
    Collection<Game> pesquisarGamePorTitulo(String tirulo);
    Collection<Game> pesquisarGamePorGenero(String genero);
    Collection<Game> pesquisarGameAnoLancamento(int ano);
    void atualizarGamr(String titulo, String novoTitulo, String genero, int ano)throws MidiaNaoExisteException;
    void remmoverGame(String titulo)throws MidiaNaoExisteException;
    void atualizarMidia(String titulo, String novoTitulo, String Genero, int ano)throws MidiaNaoExisteException;
    void removerMidia(String tirulo)throws MidiaNaoExisteException;
    void salvarDados();
    void recuperarDados();
}
