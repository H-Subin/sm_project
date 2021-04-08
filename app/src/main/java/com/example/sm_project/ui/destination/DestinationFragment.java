package com.example.sm_project.ui.destination;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sm_project.R;

public class DestinationFragment extends Fragment {

   // public static DestinationFragment newInstance() {return new DestinationFragment();}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_destination, container, false);
       /* Button button = root.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((NavActivityActivity)getActivity()).replaceFragment(Budget.newInstance());
            }
        });
*/
        return root;
    }
}