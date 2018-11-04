package com.example.dicossoftware.museusa15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class ListarArtefatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_artefato);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuAdicionar) {
            Intent intent = new Intent(this, AdicionarArtefatoActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.menuListar) {
            Intent intent = new Intent(this, ListarArtefatoActivity.class);
            startActivity(intent);
        }
        return true;
    }
}
