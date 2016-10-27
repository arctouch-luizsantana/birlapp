package br.unisul.birlapp;

import android.content.Intent;
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

        switch (nivel) {
            case 2:
                imagem.setImageResource(R.drawable.biceps02);
                break;
            case 3:
                imagem.setImageResource(R.drawable.biceps03);
                break;
            case 4:
                imagem.setImageResource(R.drawable.biceps04);
                break;
            case 5:
                imagem.setImageResource(R.drawable.biceps05);
                break;
            case 6:
            default:
                Intent intent = new Intent(this, BamBamActivity.class);
                startActivity(intent);
                return;
        }


        titulo.setText("Nivel " + nivel);
    }
}
