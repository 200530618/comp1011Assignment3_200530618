package com.example.myapplication;


import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

import static com.example.myapplication.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {

                int selectedItemId = view.getId();

                Intent intent;

                ImageView which = findViewById(selectedItemId);

                switch (selectedItemId){
                    case R.id.imageMainActivityView:
                        intent = new Intent(getApplicationContext(), ViewVehicleActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.imageMainActivityAdd:
                        intent = new Intent(getApplicationContext(), AddVehicleActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        Snackbar.make(view, "Unknown item selected", Snackbar.LENGTH_LONG).show();
                }

            }
        };

        ImageView viewVehicle = findViewById(R.id.imageMainActivityView);
        ImageView addVehicle = findViewById(R.id.imageMainActivityAdd);



        viewVehicle.setOnClickListener(onClickListener);
        addVehicle.setOnClickListener(onClickListener);


    }
}