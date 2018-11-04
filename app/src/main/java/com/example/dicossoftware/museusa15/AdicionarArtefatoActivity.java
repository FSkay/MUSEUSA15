package com.example.dicossoftware.museusa15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AdicionarArtefatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_artefato);
    }

    public void adicionarArtefato(View v) {

        ArtefatosCRUDRemoto c = new ArtefatosCRUDRemoto();

        //EditText etNMom = findViewById(R.id.etNMom);
        EditText nomeobjeto = findViewById(R.id.etNomeObjeto);
        EditText ano = findViewById(R.id.etAno);
        EditText doador = findViewById(R.id.etDoador);
        ImageView img = findViewById(R.id.ivObjeto);

        ArtefatosCRUDRemoto adicionarArtefato = new ArtefatosCRUDRemoto();

        c.execute("POST", nomeobjeto.getText().toString(),
                ano.getText().toString(),
                doador.getText().toString());

    }
}
