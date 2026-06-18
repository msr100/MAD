package com.example.a4_login_with_usernamepassword;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.*;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText uInput=findViewById(R.id.editTextTextEmailAddress);
        EditText pInput=findViewById(R.id.editTextTextPassword);

        Button btn=findViewById(R.id.button);

        btn.setOnClickListener(v -> {
            String u=uInput.getText().toString();
            String p=pInput.getText().toString();

            String msg;

            if (u.isEmpty() || p.isEmpty()) {
                msg = "inputs are empty";
            } else if (u.equals("admin") && p.equals("password")) {
                msg = "Login successfull";
            } else {
                msg = "incorrect input";
            }

            Toast.makeText(this, msg, 0).show();

        });


    }
}