package com.example.sm_project.ui.budget;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sm_project.R;

public class Budget extends Fragment {
    public static Budget newInstance() {
        return new Budget();
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_budget, container, false);
        return root;
    }
}
