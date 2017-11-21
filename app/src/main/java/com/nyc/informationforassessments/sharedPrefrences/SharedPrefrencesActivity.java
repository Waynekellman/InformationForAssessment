package com.nyc.informationforassessments.sharedPrefrences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.nyc.informationforassessments.R;

import java.util.Map;

public class SharedPrefrencesActivity extends AppCompatActivity {

    private static final String SHARED_PREFS_KEY = "sharedPrefsTesting";
    private SharedPreferences login;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_prefrences);

        login = getApplicationContext().getSharedPreferences(SHARED_PREFS_KEY, MODE_PRIVATE);
        editText = (EditText) findViewById(R.id.edit_text);
        button = (Button) findViewById(R.id.button);

        if (login.getBoolean("BooleanKey",false)) {
            editText.setText(login.getString("KEY",null));
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = login.edit();
                editor.putString("KEY",editText.getText().toString());
                editor.putBoolean("BooleanKey", true);
                editor.commit();
            }
        });

        Map<String, ?> allEntry = login.getAll();
        for (Map.Entry<String, ?> entry: allEntry.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue().toString());
        }


    }
}
