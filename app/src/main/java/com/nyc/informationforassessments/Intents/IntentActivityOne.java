package com.nyc.informationforassessments.Intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.nyc.informationforassessments.R;

/**
 * If You set this activity as the launcher you can see how intents are used.
 */
public class IntentActivityOne extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one);

        editText = (EditText) findViewById(R.id.edit_text);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntentActivityOne.this, IntentActivityTwo.class);
                Bundle bundle = new Bundle();
                bundle.putString("KEY",editText.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
