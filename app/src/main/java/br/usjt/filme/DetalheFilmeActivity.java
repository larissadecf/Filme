package br.usjt.filme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

// larissa RA:81620288

class DetalheFilmeActivity extends Activity {
    public TextView nomeFilme;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);
        TextView nomeFilme =  findViewById(R.id.txt_nome);
        Intent intent = getIntent();
        String nome = intent.getStringExtra(ListaFilmesActivity.NOME);
        nomeFilme.setText(nome);
    }
}
