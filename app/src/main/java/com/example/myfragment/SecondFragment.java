package com.example.myfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class SecondFragment extends Fragment {
    View roodView;
    TextView get_user_name;
    Button send_text;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        roodView =inflater.inflate(R.layout.fragment_second, container, false);
        return roodView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initveiw();
        bundletext();
        onClick();
    }
    private void initveiw() {

        get_user_name= roodView.findViewById(R.id.get_user_name);
        send_text=roodView.findViewById(R.id.btn_new_page);
        get_user_name=roodView.findViewById(R.id.get_user_name);


    }

    private void bundletext() {
        Bundle bundle = getArguments();
        String my_user_name =bundle.getString("username");
        get_user_name.setText(my_user_name);
    }

    public void onClick() {
        send_text.setOnClickListener(view1 -> { {
            Bundle bundle = new Bundle();
            String my_user_name =get_user_name.getText().toString();
            bundle.putString("username",my_user_name);
            threeFragment threeFragment =new threeFragment();
            threeFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.continer,threeFragment).commit();
        }
        });
    }
}