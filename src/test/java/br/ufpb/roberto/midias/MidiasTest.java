package br.ufpb.roberto.midias;

import br.ufpb.roberto.midias.midia.Filme;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MidiasTest {

    @Test
    public void testaConstrutor(){
        String[] elenco = {"robert", "chris"};
        Filme filme1 = new Filme("homem de ferro", "ação", 2015, "filme de acão",elenco, "russel", 120);
        assertTrue(filme1.getTitulo().equals("homem de ferro"));
        assertEquals(120, filme1.getDuracao());
        assertEquals(2015, filme1.getAnoLancamento());
    }
}
