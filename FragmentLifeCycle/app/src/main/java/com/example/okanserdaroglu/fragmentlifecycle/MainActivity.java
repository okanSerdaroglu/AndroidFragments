package com.example.okanserdaroglu.fragmentlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String LOG = "LIFE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().
                add(R.id.container,new LifeCycleFragment(),"lifeCycleFragment").commit();
        Log.e(LOG,getString(R.string.activityOnCreate));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(LOG,getString(R.string.activityOnStart));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(LOG,getString(R.string.activityOnResume));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(LOG,getString(R.string.activityOnPause));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(LOG,getString(R.string.activityOnStop));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(LOG,getString(R.string.activityOnDestroy));
    }
}
