package com.example.okanserdaroglu.fragmentlifecycle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String LOG = "LIFE";
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(LOG,getString(R.string.activityOnCreate));
        /** must be implemented
         *  call setContentView
         *  initialize display layout
         *  initialize variables
         *  start backgroud thread
         */
        manager = getSupportFragmentManager();

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

    public void addFragmentA(View view) {
        manager.beginTransaction().
                add(R.id.container,new FragmentA(),"fragmentA").commit();
    }

    public void addFragmentB(View view) {
        manager.beginTransaction().
                add(R.id.container,new FragmentB(),"fragmentB").commit();
    }

    public void replaceWithA(View view) {
        manager.beginTransaction().
                replace(R.id.container,new FragmentA(),"fragmentA").commit();
    }

    public void replaceWithB(View view) {
         manager.beginTransaction().
                 replace(R.id.container,new FragmentB(),"fragmentB").commit();
    }

    public void removeFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            manager.beginTransaction().remove(fragmentA).commit();
        } else {
            Toast.makeText(this,R.string.fragment_A_bulunamadi,
                    Toast.LENGTH_LONG).show();
        }
    }

    public void removeFragmentB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("fragmentB");
        if (fragmentB != null) {
            manager.beginTransaction().
                    remove(manager.findFragmentByTag("fragmentB")).commit();
        }else {
            Toast.makeText(this,R.string.fragment_b_bulunamadi,
                    Toast.LENGTH_LONG).show();
        }
    }

    public void attachFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null){
            manager.beginTransaction().attach(fragmentA).commit();
        } else {
            Toast.makeText(this,R.string.fragment_A_bulunamadi,
                    Toast.LENGTH_LONG).show();
        }
    }

    public void detachFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null){
            manager.beginTransaction().detach(fragmentA).commit();
        } else {
            Toast.makeText(this,R.string.fragment_A_bulunamadi,
                    Toast.LENGTH_LONG).show();
        }
    }

    public void showFragmentA(View view) {
    }

    public void hideFragmentA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("fragmentA");
        if (fragmentA != null) {
            manager.beginTransaction().hide(fragmentA).commit();
        } else {
            Toast.makeText(this,R.string.fragment_A_bulunamadi,
                    Toast.LENGTH_LONG).show();
        }
    }

}
