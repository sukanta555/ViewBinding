package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Initialize variable
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater()); // inflate method
        setContentView(binding.getRoot());
        //setOnClickListener method use
        binding.uName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Uname",Toast.LENGTH_SHORT).show();
            }
        });
        //setOnClickListener method use
        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Submit Successfully",Toast.LENGTH_SHORT).show();
            }
        });

    }
}