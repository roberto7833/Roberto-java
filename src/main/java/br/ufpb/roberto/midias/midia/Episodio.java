package br.ufpb.roberto.midias.midia;

public class Episodio {
    private String nomeEp;
    private int duracaoEp;

    public Episodio(String nomeEp, int duracaoEp) {
        this.nomeEp = nomeEp;
        this.duracaoEp = duracaoEp;
    }
    public String getNomeEp() {
        return this.nomeEp;
    }
    public void setNomeEp(String nomeEp) {
        this.nomeEp = nomeEp;
    }
    public int getDuracaoEp() {
        return this.duracaoEp;
    }
    public void setDuracaoEp(int duracaoEp) {
        this.duracaoEp = duracaoEp;
    }
    @Override
    public String toString(){
        return "Episodio "+this.nomeEp +"\nDuracao " +this.duracaoEp;
    }
}
