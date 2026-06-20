package com.example.a5_implicit_explicit_content_provider;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ActivityResultLauncher<String> pickerLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // ---------------- EXPLICIT INTENT ----------------
        // Opens another activity inside your app


//        Intent i = new Intent(MainActivity.this, SecondActivity.class);
//        startActivity(i);



        // ---------------- IMPLICIT INTENT ----------------
         //Opens external app (like browser)

//        Button button = findViewById(R.id.button);
//
//        button.setOnClickListener(v -> {
//            Uri link = Uri.parse("https://www.google.com");
//            Intent i = new Intent(Intent.ACTION_VIEW, link);
//            startActivity(i);
//        });



        // ---------------- MODERN PHOTO PICKER (CONTENT ACCESS) ----------------

//        Button btnPick = findViewById(R.id.btnPick);
//        imageView = findViewById(R.id.imageView);
//
//        pickerLauncher = registerForActivityResult(
//                new ActivityResultContracts.GetContent(),
//                uri -> {
//                    if (uri != null) {
//                        imageView.setImageURI(uri);
//                    }
//                }
//        );
//
//        btnPick.setOnClickListener(v -> {
//            pickerLauncher.launch("image/*");
//        });
    }
}