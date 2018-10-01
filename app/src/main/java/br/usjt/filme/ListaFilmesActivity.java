package br.usjt.filme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
// larissa RA:81620288

public class ListaFilmesActivity extends Activity {
    public static final String NOME  ="br.usjt.filme.controllernomedofilme";
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
        ListView listView = (ListView) findViewById(R.id.lista_filmes);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, filmes);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String nome = filmes.get(i);
                Intent intent = new Intent(activity, DetalheFilmeActivity.class);
                intent.putExtra(NOME, nome);
                startActivity(intent);
            }
        });
}

    private ArrayList<String> buscaFilmes(String chave) {
        ArrayList<String> resultado;

        if(chave != null && chave.length() > 0){
            resultado = new ArrayList<>();
            ArrayList<String> lista = listaFilmes();
            for(String filme:lista){
                if(filme.toUpperCase().contains(chave.toUpperCase())){
                    resultado.add(filme);
                }
            }
            return resultado;
        } else {
            return listaFilmes();
        }
    }

    private ArrayList<String> listaFilmes() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("VINGADORES: GUERRA INFINITA");
        lista.add("HOMEM-FORMIGA E A VESPA");
        lista.add("DEADPOOL 2");
        lista.add("JOGADOR N1");
        lista.add("TOMB RAIDER: A ORIGEM.");
        lista.add("A FREIRA");
        lista.add("OS INCRÍVEIS 2");
        lista.add("PREDADOR");
        lista.add("PANTERA NEGRA");
        lista.add("22 MILHAS");
        lista.add("A MALDIÇÃO DA CASA WINCHESTER");
        lista.add("MISSÃO IMPOSSÍVEL: EFEITO FALLOUT");
        lista.add("OITO MULHERES E UM SEGREDO");
        lista.add("UM LUGAR SILENCIOSO");
        lista.add("MAZE RUNNER: A CURA MORTAL");

        return lista;
    }
}
