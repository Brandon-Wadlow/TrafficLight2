package com.wadlow.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//MainActivity listens to ButtonClick Listeners from the Fragment
public class MainActivity extends AppCompatActivity implements ButtonFragment.Listener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClicked() {
        TrafficLightFragment fragment = (TrafficLightFragment) getSupportFragmentManager()
                .findFragmentById(R.id.light_fragment);
        //when the button is clicked in the ButtonFragment
        fragment.onButtonClicked();
    }
}