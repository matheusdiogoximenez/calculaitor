package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout tela =findViewById(R.id.tela);
        TextView textView = findViewById(R.id.textView);
        Button button =findViewById(R.id.button);
        Button buttonC =findViewById(R.id.buttonLimpar);
        textView.setText( "hello" );
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText( "tocou no botao" );
                tela.setBackgroundColor(getResources().getColor(R.color.purple_200));
            }
        });


        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText( "" );
                tela.setBackgroundColor(getResources().getColor(R.color.teal_200));

            }
        });
    }
}