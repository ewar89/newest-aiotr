package com.schneewittchen.rosandroid.ui.fragments.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.schneewittchen.rosandroid.R;
import com.schneewittchen.rosandroid.ui.general.TabButton;
//import com.schneewittchen.rosandroid.ui.fragments.map.MapxusFragment;

import org.jetbrains.annotations.NotNull;

public class HomeFragment extends Fragment {

    private static TabButton autoNav, settings, joystick, shc, robotArm, manualControl;
//    private AppCompatButton manualControlButton;
//    private AppCompatButton settingsButton;


    final public static String TAG = HomeFragment.class.getSimpleName();
//    NavController navController;

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Log.d(TAG, "onCreateView: HOMEFRAGMENT CREATED. DICK AND BALLS INCLUDED. ");

//        (autoNav = new TabButton(v.findViewById(R.id.autoNav))).linkToFragment(9, getParentFragmentManager().beginTransaction());

        (settings = new TabButton(v.findViewById(R.id.settings))).linkToFragment(3, getParentFragmentManager().beginTransaction());

        (shc = new TabButton(v.findViewById(R.id.shc))).linkToFragment(5, getParentFragmentManager().beginTransaction());

        (robotArm = new TabButton(v.findViewById(R.id.robotArm))).linkToFragment(8, getParentFragmentManager().beginTransaction());

        (manualControl = new TabButton(v.findViewById(R.id.manualControl))).linkToFragment(9, getParentFragmentManager().beginTransaction());

//        manualControlButton = (AppCompatButton) (v.findViewById(R.id.manualControl));
//        manualControlButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                navController.navigate(R.id.action_to_vizFragment);
//            }
//        });
//
//        settingsButton = (AppCompatButton) (v.findViewById(R.id.settings));
//        settingsButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                navController.navigate(R.id.action_to_masterFragment);
//            }
//        });


        return v;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        navController = Navigation.findNavController(requireActivity(), R.id.fragment_container);

        //navController.navigate(R.id.action_to_masterFragment)

        // Setup tabs for navigation
    }
}
