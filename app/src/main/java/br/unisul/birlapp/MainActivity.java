package br.unisul.birlapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int nivel = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titulo = (TextView) findViewById(R.id.titulo);
        Button botao = (Button) findViewById(R.id.button);
        ImageView imagem = (ImageView) findViewById(R.id.imageView);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nivel++;
                Toast.makeText(getApplicationContext(), "Nivel atual: " + nivel, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
