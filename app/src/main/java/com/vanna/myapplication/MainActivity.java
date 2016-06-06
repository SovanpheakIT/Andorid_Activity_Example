package com.vanna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button detailButton = (Button) findViewById(R.id.button);
        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailIntent = new Intent(getApplicationContext(), NewsDetailActivity.class);
                detailIntent.putExtra("NEWS_ID", "2001");
                startActivity(detailIntent);
            }
        });

    }
}
