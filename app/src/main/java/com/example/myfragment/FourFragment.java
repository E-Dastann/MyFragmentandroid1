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

public class FourFragment extends Fragment {
    private TextView textView;
    private View view;
    private Button btnSend;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
                view= inflater.inflate(R.layout.fragment_four, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        bundleText();
        onClik();
    }


    private void bundleText() {
        Bundle bundle = getArguments();
        String my_user_name =bundle.getString("username");
        textView.setText(my_user_name);
    }

    private void initView() {
        textView = view.findViewById(R.id.text_view);
        btnSend= view.findViewById(R.id.btn_send);

    }
    private void onClik() {
        btnSend.setOnClickListener(view1 -> { {
            Bundle bundle = new Bundle();
            String my_user_name =textView.getText().toString();
            bundle.putString("username",my_user_name);
            FiveFragment fiveFragment =new FiveFragment();
            fiveFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.continer,fiveFragment).commit();
        }
        });
    }

}