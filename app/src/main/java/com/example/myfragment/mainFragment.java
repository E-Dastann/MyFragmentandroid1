package com.example.myfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class mainFragment extends Fragment {
    View roodView;
    EditText editText;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        roodView = inflater.inflate(R.layout.fragment_main, container, false);
        return roodView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initview();
        onClick();

    }

    private void initview() {
        editText = roodView.findViewById(R.id.text);
        button = roodView.findViewById(R.id.btn_send);

    }

    public void onClick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                String my_user_name = editText.getText().toString();
                bundle.putString("username", my_user_name);
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.continer, secondFragment).commit();


            }
        });

}
}