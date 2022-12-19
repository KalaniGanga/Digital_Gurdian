package com.example.digitalguardian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Patient> patientList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        patientList = new ArrayList<>();
        patientList.add(new Patient("1234","Kalani Ganga Parapitiya",01,31,"this is test","Female"));
        patientList.add(new Patient("5678","Poornima Mayadunna",02,34,"this is test", "Female"));
        patientList.add(new Patient("9012","Laksha Silva",03,37,"this is test","Female"));
        System.out.println(patientList);
        //setting adapter and listview
        PatientAdapter adapter = new PatientAdapter(getApplicationContext(),
                R.layout.activity_listview, patientList);
        ListView listview = findViewById(R.id.patient_list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);
                System.out.println(l);
                startActivity(new Intent(MainActivity.this,PatientProfile.class));

            }
        });



    }



}