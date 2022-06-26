package com.example.primeiroprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.orange)));

        //Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.orange)));

        IniciarWidgets();

       button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnClickBottom();
            }
       });
    }

    private void IniciarWidgets(){
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView.setVisibility(View.INVISIBLE);
    }

    private void OnClickBottom(){
        switch (contador) {
            case 0:
                textView.setVisibility(View.VISIBLE);
                textView.setText("Hello World!!!");
                contador = 1;
                break;
            case 1:
                textView.setText("Não seja RETARDADO.");
                contador = 2;
                break;
            case 2:
                textView.setText("De novo isso.");
                contador = 3;
                break;
            case 3:
                textView.setText("Isso está ficando chato");
                contador = 4;
                break;
            case 4:
                textView.setText("Não brinco mais");
                contador = 5;
                break;
            case 5:
                textView.setText("...");
                contador = 6;
                break;
            case 6:
                textView.setText("Você é insistente");
                contador = 7;
                break;
            default:
                textView.setText("Tchau");
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        System.exit(0);
                    }
                }, 3000);

        }
    }
}
