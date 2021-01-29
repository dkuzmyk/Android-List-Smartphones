package com.dkuzmy3.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity3 extends AppCompatActivity {

    TextView text;
    String specText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);

        text = findViewById(R.id.specsDesc);

        Intent intent = getIntent();
        Bundle bundle = this.getIntent().getExtras();

        specText = intent.getStringExtra("specs");
        text.setText(specText);
    }
}