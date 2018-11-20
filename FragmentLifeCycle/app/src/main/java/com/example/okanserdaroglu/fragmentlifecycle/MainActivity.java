package com.example.okanserdaroglu.fragmentlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final String LOG = "LIFE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().
                add(R.id.container,new LifeCycleFragment(),"lifeCycleFragment").commit();
        Log.e(LOG,getString(R.string.activityOnCreate));
        /** must be implemented
         *  call setContentView
         *  initialize display layout
         *  initialize variables
         *  start backgroud thread
         */
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(LOG,getString(R.string.activityOnStart));
        /** register broadcast receivers
         *  reinitialize states
         */

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(LOG,getString(R.string.activityOnResume));
        /** commit changes
         *  save variables
         *  restore variables
         *  restart animations
         */
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(LOG,getString(R.string.activityOnPause));
        /** commit changes
         *  save variables
         *  save preferences
         *  stop animations
         *  unregister broadcastReciever
         *
         */
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(LOG,getString(R.string.activityOnStop));
        /** close server connections
         *  free resources
         *  unregister broadcast receiver
         */
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(LOG,getString(R.string.activityOnDestroy));
        /** close database
         *  release remaining resources
         *  stop background thread
         */
    }

}
