package com.example.dicossoftware.museusa15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class EditarArtefatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_artefato);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;

        switch (item.getItemId()) {
            case R.id.menuAdicionar:
                intent = new Intent(this, AdicionarArtefatoActivity.class);
                startActivity(intent);
                break;

            case R.id.menuListar:
                intent = new Intent(this, ListarArtefatoActivity.class);
                startActivity(intent);
                break;

           /* case R.id.contato:
                intent = new Intent(this, ContatoActivity.class);
                startActivity(intent);
                break;

            case R.id.mAdm:
                intent = new Intent(this, CadastroAcervo.class);
                startActivity(intent);
                break;*/
        }
        return true;
    }
    public void editar (View view){
        ArtefatosCRUDRemoto c = new ArtefatosCRUDRemoto();

        //EditText etNMom = findViewById(R.id.etNMom);
        EditText nomeobjeto = findViewById(R.id.etNomeObjeto);
        EditText epoca = findViewById(R.id.etAno);
        EditText doador = findViewById(R.id.etDoador);
        ImageView img = findViewById(R.id.ivObjeto);

        c.execute("PUT", nomeobjeto.getText().toString(),
                epoca.getText().toString(),
                doador.getText().toString(),
                img.getImageMatrix().toString());
        finish();


    }
    //Para encerrar uma atividade, chame o método finish()
    public void cancelar(View view){ finish();
    }

}
