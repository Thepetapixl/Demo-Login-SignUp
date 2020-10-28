package com.example.demologinsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText TextEmail;
    private EditText TextPass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.buttonLogin);
        Button btnClear = findViewById(R.id.buttonClear);
        TextEmail = findViewById(R.id.editTextTextEmailAddress);
        TextPass = findViewById(R.id.editTextTextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String login = TextEmail.getText().toString();
                String password = TextPass.getText().toString();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextEmail.setText("");
                TextPass.setText("");

            }
        });
    }


}