package com.example.dicossoftware.museusa15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AdicionarArtefatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_artefato);
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

    public void adicionarArtefato(View v) {

        ArtefatosCRUDRemoto c = new ArtefatosCRUDRemoto();

        //EditText etNMom = findViewById(R.id.etNMom);
        EditText nomeobjeto = findViewById(R.id.etNomeObjeto);
        EditText epoca = findViewById(R.id.etAno);
        EditText material = findViewById(R.id.etMaterial);
        EditText doador = findViewById(R.id.etDoador);
        ImageView img = findViewById(R.id.ivObjeto);

        c.execute("POST", nomeobjeto.getText().toString(),
                epoca.getText().toString(),
                material.getText().toString(),
                doador.getText().toString(),
                img.getImageMatrix().toString());
        finish();

    }
    public void cancelar(View v){
        finish();
    }
    static final int REQUEST_IMAGE_CAPTURE = 1;

private void dispatchTakePictureIntent() {
    Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
        startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
    }
}
}
