package com.maninder.day2_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editEmail;
    private EditText editPassword;
    private Button buttonSign;
    private Button buttonClear;
    private TextView errorMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editpassword);
        errorMessage = findViewById(R.id.labelMessage);

        buttonClear = findViewById(R.id.buttonClear);
        buttonSign = findViewById(R.id.buttonSignIn);

        buttonSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editEmail.getText().toString();
                Toast.makeText(MainActivity.this,email, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
