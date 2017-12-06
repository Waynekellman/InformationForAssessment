package com.nyc.informationforassessments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;
    private Button button;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        radioGroup = findViewById(R.id.radiogroup);

        if(savedInstanceState!= null){
            editText.setText(savedInstanceState.getString("key"));
            radioGroup.check(savedInstanceState.getInt("key"));
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string = editText.getText().toString();
                textView.setText(string);
                editText.setText("");
            }
        });


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("key",editText.getText().toString());
        outState.putInt("key", radioGroup.getCheckedRadioButtonId());
    }
}
