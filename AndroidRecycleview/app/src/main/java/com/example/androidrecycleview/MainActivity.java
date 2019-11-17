package com.example.androidrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class
MainActivity extends AppCompatActivity {
RecyclerView rvNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvNumber=findViewById(R.id.rvNumber);
        rvNumber.setLayoutManager(new LinearLayoutManager(this));

//        NumberAdapter adapter=new NumberAdapter();
//        rvNumber.setAdapter(adapter);

        final List<String> data = new ArrayList<>();

        for(int i = 0; i<5 ;i++){
            data.add("Phong");
            data.add("Loc");
            data.add("Toan");
            data.add("Loan");
        }
        final NumberAdapter adapter = new NumberAdapter();

        adapter.data = data;
        rvNumber.setAdapter(adapter);

        findViewById(R.id.addNew).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.add("New student");
                adapter.notifyDataSetChanged();
            }
        });

    }
}
