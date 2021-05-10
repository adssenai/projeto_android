package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_texto;
    private EditText et_texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_texto = (EditText) findViewById(R.id.et_texto);
        et_texto2 = (EditText) findViewById(R.id.et_texto2);
    }

    public void onClickBtnMostrar(View v){

        Toast.makeText(MainActivity.this, "Olá " + et_texto.getText() + " " + et_texto2.getText(), Toast.LENGTH_LONG).show();
    }

    public void onClickBtnLimpar(View r){

        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);

        editText.setText(null);
        editText2.setText(null);

        editText.setText("");
        editText2.setText("");

        editText.requestFocus();



    }

}