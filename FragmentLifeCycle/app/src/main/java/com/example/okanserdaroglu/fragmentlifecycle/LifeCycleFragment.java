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
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(LOG,getString(R.string.fragmentOnCreateFragment));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        Log.e(LOG,getString(R.string.fragmentOnCreateView));
        return inflater.inflate(R.layout.fragmment_life_cycle,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(LOG,getString(R.string.fragmentOnActivityCreated));
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(LOG, getString(R.string.fragmentOnResume));
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(LOG,getString(R.string.fragmentOnStart));
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(LOG, getString(R.string.fragmentOnPause));
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(LOG, getString(R.string.fragmentOnStop));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(LOG, getString(R.string.fragmentOnDestroy));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(LOG, getString(R.string.fragmentOnDestroyView));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(LOG, getString(R.string.fragmentOnDetach));
    }
}
