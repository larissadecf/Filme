package br.usjt.filme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
// larissa RA:81620288

public class ListaFilmesActivity extends Activity {

    public static final String FILME ="br.usjt.filme" ;
    private ArrayList<String> filmes;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        setContentView(R.layout.activity_lista_filmes);
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        filmes = buscaFilmes(chave);
        ListView listView = findViewById(R.id.lista_filmes);
        FilmeAdapter adapter = new FilmeAdapter(filmes, this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Filme filme = filmes.get(i);
                Intent intent = new Intent(activity, DetalheFilmeActivity.class);
                intent.putExtra(FILME, filmes);
                startActivity(intent);
            }
        });
}

    private ArrayList<String> buscaFilmes(String chave) {
        ArrayList<String> resultado;

        if(chave != null && chave.length() > 0){
            resultado = new ArrayList<>();
            ArrayList<Filme> lista = listaFilmes();
            for(Filme filme:lista){
                if(filme.getNomeFilme().toUpperCase().contains(chave.toUpperCase())){
                    resultado.add(filme);
                }
            }
            return resultado;
        } else {
            return listaFilmes();
        }
    }

    private ArrayList<Filme> listaFilmes() {
        ArrayList<Filme> lista = new ArrayList<>();
        Filme[] filmes = FilmeDAO.getFilmes();
        for(Filme filme: filmes){
            lista.add(filme);
        }
        return lista;

    }
}
