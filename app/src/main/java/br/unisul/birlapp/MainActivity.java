package br.unisul.birlapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int nivel = 1;
    private ImageView imagem;
    private Button botao;
    private TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titulo = (TextView) findViewById(R.id.titulo);
        botao = (Button) findViewById(R.id.button);
        imagem = (ImageView) findViewById(R.id.imageView);

        botao.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        nivel++;
        titulo.setText("Nivel " + nivel);
    }
}
