package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class viewOrder extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter articleAdapter = new MyAdapter();
        articleAdapter.setAr(DataStore.array);
        recyclerView.setAdapter(articleAdapter);

        TextView total = (TextView)findViewById(R.id.textView3);
        double totalAmount = 0;
        for(int i = 0; i < DataStore.array.size(); i++){
            ArrayList<String> order = DataStore.array.get(i);
            Data data = DataInfo.getDataById(Integer.parseInt(order.get(0)));
            int quantity = Integer.parseInt(order.get(1));
            double price = data.getPrice();
            totalAmount += (quantity * price);
        }
        total.setText(" Total: $" + String.valueOf(totalAmount));

    }


}
