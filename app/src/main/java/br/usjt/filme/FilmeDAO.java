package br.usjt.filme;

class FilmeDAO {
    private static Filme[] filmes;

    private FilmeDAO(){}

    static Filme[] getFilmes() {
        if (filmes == null){
            filmes = new Filme[15];
            filmes[1] = new Filme(1,"VINGADORES: GUERRA INFINITA","JOE RUSSO, ANTHONY RUSSO","26 DE ABRIL DE 2018 ");
            filmes[2] = new Filme(2,"HOMEM-FORMIGA E A VESPA","PEYTON REED","5 DE JULHO DE 2018");
            filmes[3] = new Filme(3,"DEADPOOL 2","David Leitch"," 17 de Maio de 2018");
            filmes[4] = new Filme(4,"JOGADOR N1","Steven Spielberg","29 de Março de 2018");
            filmes[5] = new Filme(5,"TOMB RAIDER: A ORIGEM.","Roar Uthaug","15 de Março de 2018");
            filmes[6] = new Filme(6,"A FREIRA","Corin Hardy","6 de Setembro de 2018");
            filmes[7] = new Filme(7,"OS INCRÍVEIS 2","BRAD BIRD","28 de Junho de 2018");
            filmes[8] = new Filme(8,"PREDADOR","SHANE BLACK","13 de Setembro de 2018");
            filmes[9] = new Filme(9,"PANTERA NEGRA","Ryan Coogler","15 de Fevereiro de 2018");
            filmes[10] = new Filme(10,"22 MILHAS","Peter Berg","20 de Setembro de 2018");
            filmes[11] = new Filme(11,"A MALDIÇÃO DA CASA WINCHESTER","Michael Spierig Peter Spierig","1 de Março de 2018");
            filmes[12] = new Filme(12,"MISSÃO IMPOSSÍVEL: EFEITO FALLOUT","Christopher McQuarrie","26 de Julho de 2018");
            filmes[13] = new Filme(13,"OITO MULHERES E UM SEGREDO","Gary Ross (I)","7 de Junho de 2018 ");
            filmes[14] = new Filme(14,"UM LUGAR SILENCIOSO","John Krasinski","5 de Abril de 2018");
            filmes[15] = new Filme(15,"MAZE RUNNER: A CURA MORTAL","Wes Ball","25 de Janeiro de 2018");


        }

        return filmes;
    }
}
