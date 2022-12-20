package com.example.digitalguardian;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

public class PatientProfile extends AppCompatActivity {
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_profile);
        builder = new AlertDialog.Builder(PatientProfile.this);
        builder.setMessage("Room number 01 Patient needs you now. Please go to him")
                .setCancelable(false);
        //Creating dialog box
        AlertDialog alert = builder.create();

        alert.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                alert.getWindow().setBackgroundDrawableResource(R.color.green);


            }
        });
        //Setting the title manually
        alert.setTitle("Notification !!");
        alert.show();


    }
}