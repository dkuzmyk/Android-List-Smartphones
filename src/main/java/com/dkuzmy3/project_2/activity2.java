package com.dkuzmy3.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class activity2 extends AppCompatActivity {

    ImageView image;
    int position;
    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        image = findViewById(R.id.fullScreenImage);        // setting image to layout

        if(position == 0){
            Intent intent = getIntent();                   // unwrap the intent
            Bundle bundle = this.getIntent().getExtras();  // unwrap the bundle

            link = intent.getStringExtra("link");   // get link of website

            int picture = bundle.getInt("image");     // get image
            image.setImageResource(picture);               // set image

            image.setOnClickListener(new View.OnClickListener(){    // on click on the image
                @Override
                public void onClick(View view) {
                    try {
                        Log.i("Check link", link);              // cast browsable link
                        Uri web = Uri.parse(link);
                        Intent openWeb = new Intent(Intent.ACTION_VIEW);
                        openWeb.addCategory(Intent.CATEGORY_BROWSABLE);
                        openWeb.setData(web);
                        startActivity(openWeb);
                    }catch(Exception e){}
                }
            });
        }

        if(position == 1){
            Intent intent = getIntent();                   // unwrap the intent
            Bundle bundle = this.getIntent().getExtras();  // unwrap the bundle

            link = intent.getStringExtra("link");   // get link of website

            int picture = bundle.getInt("image");     // get image
            image.setImageResource(picture);               // set image

            image.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    try {
                        Log.i("Check link", link);
                        Uri web = Uri.parse(link);
                        Intent openWeb = new Intent(Intent.ACTION_VIEW);
                        openWeb.addCategory(Intent.CATEGORY_BROWSABLE);
                        openWeb.setData(web);
                        startActivity(openWeb);
                    }catch(Exception e){}
                }
            });
        }

        if(position == 2){
            Intent intent = getIntent();                   // unwrap the intent
            Bundle bundle = this.getIntent().getExtras();  // unwrap the bundle

            link = intent.getStringExtra("link");   // get link of website

            int picture = bundle.getInt("image");     // get image
            image.setImageResource(picture);               // set image

            image.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    try {
                        Log.i("Check link", link);
                        Uri web = Uri.parse(link);
                        Intent openWeb = new Intent(Intent.ACTION_VIEW);
                        openWeb.addCategory(Intent.CATEGORY_BROWSABLE);
                        openWeb.setData(web);
                        startActivity(openWeb);
                    }catch(Exception e){}
                }
            });
        }

        if(position == 3){
            Intent intent = getIntent();                   // unwrap the intent
            Bundle bundle = this.getIntent().getExtras();  // unwrap the bundle

            link = intent.getStringExtra("link");   // get link of website

            int picture = bundle.getInt("image");     // get image
            image.setImageResource(picture);               // set image

            image.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    try {
                        Log.i("Check link", link);
                        Uri web = Uri.parse(link);
                        Intent openWeb = new Intent(Intent.ACTION_VIEW);
                        openWeb.addCategory(Intent.CATEGORY_BROWSABLE);
                        openWeb.setData(web);
                        startActivity(openWeb);
                    }catch(Exception e){}
                }
            });
        }

        if(position == 4){
            Intent intent = getIntent();                   // unwrap the intent
            Bundle bundle = this.getIntent().getExtras();  // unwrap the bundle

            link = intent.getStringExtra("link");   // get link of website

            int picture = bundle.getInt("image");     // get image
            image.setImageResource(picture);               // set image

            image.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    try {
                        Log.i("Check link", link);
                        Uri web = Uri.parse(link);
                        Intent openWeb = new Intent(Intent.ACTION_VIEW);
                        openWeb.addCategory(Intent.CATEGORY_BROWSABLE);
                        openWeb.setData(web);
                        startActivity(openWeb);
                    }catch(Exception e){}
                }
            });
        }

        if(position == 5){
            Intent intent = getIntent();                   // unwrap the intent
            Bundle bundle = this.getIntent().getExtras();  // unwrap the bundle

            link = intent.getStringExtra("link");   // get link of website

            int picture = bundle.getInt("image");     // get image
            image.setImageResource(picture);               // set image

            image.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    try {
                        Log.i("Check link", link);
                        Uri web = Uri.parse(link);
                        Intent openWeb = new Intent(Intent.ACTION_VIEW);
                        openWeb.addCategory(Intent.CATEGORY_BROWSABLE);
                        openWeb.setData(web);
                        startActivity(openWeb);
                    }catch(Exception e){}
                }
            });
        }
    }
}