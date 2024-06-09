package com.example.last;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button loginbtn,btngo;
    private EditText Username, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Password = (EditText) findViewById(R.id.etPassword);
        Username = (EditText) findViewById(R.id.etUsername);
        loginbtn = (Button) findViewById(R.id.loginbtn);
        btngo = (Button) findViewById(R.id.btngo);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Username: "
                        + Password.getText().toString()
                        +" Password: "
                        + Password.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
        btngo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (Password.getText().toString().equals("123") && Username.getText().toString().equals("Retaj")){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
}
                else{
                    Toast.makeText(MainActivity.this,"correct: "
                            + Username.getText().toString()
                            +" Errooooooooooooor: "
                            + Password.getText().toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}