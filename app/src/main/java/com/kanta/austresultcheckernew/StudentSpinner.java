package com.kanta.austresultcheckernew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class StudentSpinner extends AppCompatActivity {

     String[] departmantList;

     private Spinner sspinner;
     private TextView stextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_spinner);
        departmantList = getResources().getStringArray(R.array.department_List);
        sspinner = (Spinner) findViewById(R.id.spinnerId);
        stextView = (TextView) findViewById(R.id.textViewId);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view,R.id.listViewId,departmantList);
        sspinner.setAdapter(adapter);
        departmantList = getResources().getStringArray(R.array.department_List);


    }
}

