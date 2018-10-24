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
    public void adicionarArtefato(View v) {
        //EditText etNMom = findViewById(R.id.etNMom);
        EditText etNomeObjeto = findViewById(R.id.etNomeObjeto);
        EditText etAno = findViewById(R.id.etAno);
        EditText etDoador = findViewById(R.id.etDoador);

        AdicionarArtefato adicionarArtefato = new AdicionarArtefato();

        adicionarArtefato.execute(etNomeObjeto.getText().toString(), etAno.getText().toString(),
                etDoador.getText().toString());

    }
}
