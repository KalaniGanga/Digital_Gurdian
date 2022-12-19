package com.example.digitalguardian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
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
        patientList.add(new Patient("Kalani Ganga Parapitiya",01,31,"this is test","Female"));
        patientList.add(new Patient("Poornima Mayadunna",02,34,"this is test", "Female"));
        patientList.add(new Patient("Laksha Silva",03,37,"this is test","Female"));
        System.out.println(patientList);
        //setting adapter and listview
        PatientAdapter adapter = new PatientAdapter(getApplicationContext(),
                R.layout.activity_listview, patientList);
        ListView listview = findViewById(R.id.patient_list);
        listview.setAdapter(adapter);
    }



}