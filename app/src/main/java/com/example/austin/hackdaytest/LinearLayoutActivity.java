package com.example.austin.hackdaytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Austin on 6/11/17.
 */

public class LinearLayoutActivity extends Activity {
    String msg = "Android : ";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_test);
        Log.d(msg, "The onCreate() event");
    }
}
