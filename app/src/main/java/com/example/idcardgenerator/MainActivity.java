package com.example.idcardgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.NumberPicker;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.Toast;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {
Spinner s;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
       AutoCompleteTextView autoCompleteTextView1 = findViewById(R.id.autoCompleteTextView1);
        String[] Year = new String[] {"2017-2020","2018-2021","2019-2022","2020-2023","2021-2024","2022-2025"};
        String[] Course = new String[] {"BCA","BCA(Honours)","BBA(IT)","MSC","MBA(IT)"};
        // For Year Drop Down Menu
        ArrayAdapter<String> aa = new ArrayAdapter <>(this,R.layout.dropdown_item, Year);
        autoCompleteTextView.setAdapter(aa);
        // For Course Drop Down menu
        ArrayAdapter<String> bb = new ArrayAdapter <>(this,R.layout.dropdown_item,Course);
        autoCompleteTextView1.setAdapter(bb);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + autoCompleteTextView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + autoCompleteTextView1.getText().toString(), Toast.LENGTH_SHORT).show();            }
        });
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Layoyt.class);
                startActivity(i);
            }
        });
    }

}