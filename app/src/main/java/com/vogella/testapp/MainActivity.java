package com.vogella.testapp;

import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * First method called when application is run
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /**
        if(BuildConfig.DEBUG) {
            Log.d(SyncStateContract.Constants.LOG, "onCreated Called");
        }**/
        setContentView(R.layout.activity_main);
    }

    /**
     * Creating view onclick
     * @param view
     */
    public void onClick (View view) {
        EditText input = (EditText) findViewById(R.id.main_input);
        String string = input.getText().toString();
        Toast.makeText(MainActivity.this, "Button 1 pressed", Toast.LENGTH_LONG).show();
    }


}
