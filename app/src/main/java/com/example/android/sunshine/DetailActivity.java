package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        if (intent!=null) {
            String forecast = intent.getStringExtra(Intent.EXTRA_TEXT);

            TextView view = (TextView) findViewById(R.id.detail_text_view);
            view.setText(forecast);
        } else {
            TextView view = (TextView) findViewById(R.id.detail_text_view);
            view.setText("No data found");
        }
    }
}
