package com.example.suicideideation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterFragment extends Fragment implements View.OnClickListener{

    public Button button;
    private TextView banner,registerUser;
    private FirebaseAuth mAuth;

    public static RegisterFragment newInstance(String param1, String param2) {
        RegisterFragment fragment = new RegisterFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ...
// Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
       // banner=(TextView) findViewById(R.id.banner);
        //banner.setOnClickListener(this);
        //registerUser=(Button) findViewById(R.id.registerUser);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        button=(Button) getView().findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), Home.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}