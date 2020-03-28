package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatTextView signup = (AppCompatTextView) findViewById(R.id.signuplink);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent signup = new Intent(v.getContext(),SignupActivity.class);
                startActivity(signup);
                finish();
            }
        });
//        TextInputLayout signup = (TextInputLayout) findViewById(R.id.signuplink);
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent signup = new Intent(v.getContext(),SignupActivity.class);
//                startActivity(signup);
//                finish();
//            }
//        });
    }
}
