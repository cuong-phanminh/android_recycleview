package com.example.androidrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView rvNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNumber=findViewById(R.id.rvNumber);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));

        NumberAdapter adapter=new NumberAdapter();
        rvNumber.setAdapter(adapter);

        final List<String> datal = new ArrayList<>();

        for(int i = 0; i<10 ;i++){
            datal.add("Phong");
            datal.add("Loc");
            datal.add("Toan");
            datal.add("Loan");
        }

    }
}
