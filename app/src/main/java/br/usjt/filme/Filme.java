package br.usjt.filme;

class Filme {
    private int id;
    private String nomeFilme,direcao,lancamento;

    public Filme(int id, String nomeFilme, String direcao, String lancamento) {
        this.id = id;
        this.nomeFilme = nomeFilme;
        this.direcao = direcao;
        this.lancamento = lancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }
    public String getFigura(){
        String figura = nomeFilme.replace('@', '_');
        return figura.replace('.','_');
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", direcao='" + direcao + '\'' +
                ", lancamento='" + lancamento + '\'' +
                '}';
    }
}
