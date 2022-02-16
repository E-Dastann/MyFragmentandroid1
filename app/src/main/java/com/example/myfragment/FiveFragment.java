package com.example.myfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FiveFragment extends Fragment {
    private TextView textView;
    private  View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_five, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView=view.findViewById(R.id.textinput_helper_text);
        Bundle bundle = getArguments();
        String my_user_name =bundle.getString("username");
        textView.setText(my_user_name);
        initView();
        bundletext();
    }


    private void bundletext() {

    }
    private void initView() {
        textView=view.findViewById(R.id.text_view);

    }
}