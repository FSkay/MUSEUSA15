package com.example.dicossoftware.museusa15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void adicionarLivro(View v) {
        EditText etMom = findViewById(R.id.etNmom)
        EditText etNome = findViewById(R.id.etNomeObjeto);
        EditText etAno = findViewById(R.id.etAno);
        EditText

        AdicionarArtefato adicionarArtefato = new AdicionarArtefato();

        adicionarArtefato.execute(etNome.getText().toString(),
                etAno.getText().toString());

    }
}
