package com.example.dicossoftware.museusa15;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_museu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuAdicionar) {
            Intent intent = new Intent(this, AdicionarArtefatoActivity.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.menuListar) {
            Intent intent = new Intent(this, ListarActivity.class);
            startActivity(intent);
        }
        return true;
    }

}
