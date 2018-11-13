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

public class ArtefatosCRUDRemoto extends AsyncTask <String, Void, String> {
    @Override
    protected String doInBackground(String... strings) {
        URL url;
        HttpURLConnection urlConnection = null;

        String resposta = new String();
        try {

            url = new URL("http://10.0.2.2:80//museu_crud.php");
            urlConnection = (HttpURLConnection) url.openConnection();

            switch (strings[0]){
                case "POST":

                    JSONObject artefato = new JSONObject();
                    artefato.put("nomeObj", strings[1]);
                    artefato.put("epoca", strings[2]);
                    artefato.put("material", strings[3]);
                    artefato.put("doador", strings[4]);
                    artefato.put("img", strings[5]);


                    urlConnection.setRequestMethod("POST");

                    Writer writer = new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream(), "UTF-8"));
                    writer.write(artefato.toString());

                    writer.close();

                    break;
                case "PUT":
                    artefato = new JSONObject();
                    artefato.put("nomeObj", strings[1]);
                    artefato.put("epoca", strings[2]);
                    artefato.put("material", strings[3]);
                    artefato.put("doador", strings[4]);
                    artefato.put("img", strings[5]);

                    urlConnection.setRequestMethod("PUT");

                    writer = new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream(), "UTF-8"));
                    writer.write(artefato.toString());

                    writer.close();

                    break;
                case "DELETE":

                    artefato = new JSONObject();
                    artefato.put("idmom", strings[1]);

                    urlConnection.setRequestMethod("DELETE");

                    writer = new BufferedWriter(new OutputStreamWriter(urlConnection.getOutputStream(), "UTF-8"));
                    writer.write(artefato.toString());

                    writer.close();
                    break;


            }


            InputStream in = urlConnection.getInputStream();

            InputStreamReader isw = new InputStreamReader(in);

            int data = isw.read();
            while (data != -1) {
                char current = (char) data;
                data = isw.read();

                resposta += current;

            }
        } catch (Exception e) {
            Log.d("Erro: ", e.toString());

        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
        Log.d("Retorno: ", resposta);
        return resposta;
    }
}
