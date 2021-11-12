package com.example.donation10.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.donation10.R;

public class Report extends AppCompatActivity {
    ListView listView;
    static final String[] numbers = new String[] {
            "Amount, Pay method",
            "10, Direct",
            "100, PayPal",
            "1000, Direct",
            "10, PayPal",
            "5000, PayPal"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_donate);
        listView = (ListView) findViewById(R.id.reportList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, numbers);
        listView.setAdapter(adapter);
    }
}