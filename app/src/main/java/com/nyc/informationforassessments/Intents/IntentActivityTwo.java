package com.nyc.informationforassessments.Intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nyc.informationforassessments.R;

public class IntentActivityTwo extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_two);

        textView = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String string = bundle.getString("KEY","Nothing was entered");
        textView.setText(string);
    }
}
