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

public class threeFragment extends Fragment {
    View rootView;
    TextView textView;
    Button btnSend;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_three, container, false);
        return rootView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        bundleText();
        onClik();

    }

    private void onClik() {
            btnSend.setOnClickListener(view1 -> { {
                Bundle bundle = new Bundle();
                String my_user_name =textView.getText().toString();
                bundle.putString("username",my_user_name);
                FourFragment fourFragment =new FourFragment();
                fourFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.continer,fourFragment).commit();
            }
            });
        }


    private void bundleText() {
        Bundle bundle = getArguments();
        String my_user_name =bundle.getString("username");
        textView.setText(my_user_name);
    }

    private void initView() {
        textView=rootView.findViewById(R.id.get_text_three);
        btnSend= rootView.findViewById(R.id.btn_send);
    }
}
