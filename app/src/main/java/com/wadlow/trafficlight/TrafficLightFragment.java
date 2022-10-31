package com.wadlow.trafficlight;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

//TrafficLightFragment contains the label
public class TrafficLightFragment extends Fragment {
    //label strings
    private static final String RED = "Red";
    private static final String GREEN = "Green";
    private static final String YELLOW = "Yellow";
    //colors ids
    private static final int redColor = R.color.red;
    private static final int greenColor = R.color.green;
    private static final int yellowColor = R.color.yellow;

    private TextView trafficLabel;
    //state of the traffic light
    private int state = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_traffic_light, container, false);
        trafficLabel = view.findViewById(R.id.fragment_light_label);
        onButtonClicked();
        //Inflate layout for this fragment
        return view;
    }

    public void onButtonClicked() {
        switch (state){
            case 1:
                //setting the label to red
                trafficLabel.setText(RED);
                trafficLabel.setTextColor(ContextCompat.getColor(getContext(), redColor));
                //incrementing the state
                state += 1;
                break;
            case 2:
                //setting the label to yellow
                trafficLabel.setText(YELLOW);
                trafficLabel.setTextColor(ContextCompat.getColor(getContext(), yellowColor));
                //incrementing the state
                state += 1;
                break;
            case 3:
                //setting the label to green
                trafficLabel.setText(GREEN);
                trafficLabel.setTextColor(ContextCompat.getColor(getContext(), greenColor));
                state = 1;
                break;
            default:
                //exception handling
                throw new RuntimeException("Invalid state");
        }
    }
}