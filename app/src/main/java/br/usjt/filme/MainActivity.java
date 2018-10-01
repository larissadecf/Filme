package br.usjt.filme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public static final String CHAVE ="br.usjt.filme.controller.chave";
    private EditText txtBusca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtBusca = (EditText) this.<View>findViewById(R.id.txt_busca);
    }

    public void buscarFilmes(View view) {
        Intent intent = new Intent(this, ListaFilmesActivity.class);
        String texto = txtBusca.getText().toString();
        intent.putExtra(CHAVE, texto);
        startActivity(intent);
    }
}
