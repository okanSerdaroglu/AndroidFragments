package com.example.okanserdaroglu.fragmentlifecycle;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LifeCycleFragment extends Fragment {

    private final String LOG = "LIFE";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(LOG,getString(R.string.fragmentOnAttach));
        /** the fragment has been attached to activity
         *  provides the reference to the context of activity
         */
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(LOG,getString(R.string.fragmentOnCreateFragment));
        /** initialize essential components */
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        Log.e(LOG,getString(R.string.fragmentOnCreateView));
        return inflater.inflate(R.layout.fragmment_life_cycle,container,false);
        /** fragment draws user interface
         *  return
         *  view : fragment layout root view
         *  null : fragment has no ui
         */
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(LOG,getString(R.string.fragmentOnActivityCreated));
        /** called when activity has been created */
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(LOG,getString(R.string.fragmentOnStart));
        /** fragment gets visible */
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(LOG, getString(R.string.fragmentOnResume));
        /** fragment is running state */
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.e(LOG, getString(R.string.fragmentOnPause));
        /** indication of user leave fragment
         *  fragment is still visible
         *  save the state of fragment
         */
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(LOG, getString(R.string.fragmentOnStop));
        /** fragment is not visible
         *  either host activity has been stopped or the fragment has been removed and added to backstack
         */
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(LOG, getString(R.string.fragmentOnDestroyView));
        /** opposite to onCreateView
         *  the view hierarchy of the fragment is removed
         */
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(LOG, getString(R.string.fragmentOnDestroy));
        /** final cleanup of Fragments state */
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(LOG, getString(R.string.fragmentOnDetach));
        /** fragment has been disassociated from its hosting activity */
    }
}
