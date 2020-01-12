package com.example.testlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> strings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        DisplayListview();
    }

    private void DisplayListview() {
        strings.add("Nguyễn Tuấn Ngọc");
        strings.add("Nguyễn Thị Trường Giang");
        strings.add("Nguyễn Tuấn Tý");
        ArrayAdapter <String> stringArrayAdapter= new ArrayAdapter<>(this,R.layout.list_item,R.id.txtitem,strings);
      //  stringArrayAdapter.notifyDataSetChanged();
        listView.setAdapter(stringArrayAdapter);


    }

    private void Anhxa() {
        listView= findViewById(R.id.listviewmain);
        strings= new ArrayList<>();

    }
}
