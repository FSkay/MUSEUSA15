package com.example.dicossoftware.museusa15;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;

public class AdicionarArtefato extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... strings) {
        URL url;
        HttpURLConnection urlConnection = null;

        String r = new String();
        try {
            url = new URL("http://10.0.2.2:80//android/json1/listar_artefatos.php");

            JSONObject artefato = new JSONObject();
            artefato.put("nome", strings[1]);
            artefato.put("ano", strings[2]);
            artefato.put("doador", strings[3]);


            urlConnection = (HttpURLConnection) url.openConnection();

            urlConnection.setRequestMethod("POST");

            Writer writer = new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream(), "UTF-8"));
            writer.write(artefato.toString());

            writer.close();

            InputStream in = urlConnection.getInputStream();

            InputStreamReader isw = new InputStreamReader(in);

            int data = isw.read();
            while (data != -1) {
                char current = (char) data;
                data = isw.read();

                r += current;
            }catch(Exception e){
                Log.d("Erro: ", e.toString());

            } finally{
                if (urlConnection != null) {
                    urlConnection.disconnect();
                }
            }
            Log.d("Retorno: ", r);
            return r;


        }
    }
}