package com.example.dicossoftware.museusa15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

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
}
