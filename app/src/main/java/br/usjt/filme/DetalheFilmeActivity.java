package br.usjt.filme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// larissa RA:81620288

class DetalheFilmeActivity extends Activity {
    public TextView nomeFilme, direcao, lancamento,id;
    private ImageView foto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);
        nomeFilme = findViewById(R.id.detalhe_txt_nomeFilme);
        direcao = findViewById(R.id.detalhe_txt_direcao);
        lancamento = findViewById(R.id.detalhe_txt_lancamento);
        id = findViewById((R.id.detalhe_txt_id);
        foto = findViewById(R.id.detalhe_foto_filme);

        Intent intent = getIntent();
        Filme filme = (filme)intent.getSerializableExtra(ListaFilmesActivity.FILME);
        nomeFilme.setText(filme.getNomeFilme().toString());
        direcao.setText(filme.getDirecao().toString());
        lancamento.setText(filme.getLancamento().toString());
        foto.setImageDrawable(Util.getDrawable(this, filme.getFigura()));


    }
}
