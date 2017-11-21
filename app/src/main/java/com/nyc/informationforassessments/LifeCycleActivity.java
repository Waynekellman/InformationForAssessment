package com.nyc.informationforassessments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {
    private static final String TAG = "LifeCycleActivity";

    /**
     * Called when the activity is first created - performs any necessary setup to prepare the activity for user interaction.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d(TAG,"onCreate");
    }
    /**
     * Called when the activity is first made at least partially visible to the user.
     */
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,"onStart");

    }

    /**
     * Called when the activity  is made completely visible to the user.
     */
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"onResume");

    }

    /**
     * Called when the activity is made only partially visible to the user.
     */
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"onPause");

    }

    /**
     * Called when an activity is no longer visible to the user - can be followed by either onRestart or onDestroy.
     */
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"onStop");

    }

    /**
     * Called when a stopped activity becomes active again.
     */
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"onRestart");

    }

    /**
     * Called when an activity is destroyed, possibly by the user or by the system.
     */
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy");

    }
}
