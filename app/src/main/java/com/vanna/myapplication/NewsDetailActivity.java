package com.vanna.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NewsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        Intent intent = getIntent();
        String newsId = intent.getStringExtra("NEWS_ID");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(newsId);
    }
}
