package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class selectItem extends AppCompatActivity {

    TextView tv1;
    ArrayList<String> list = new ArrayList<String>();
    int number1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_item);
        ImageView img = (ImageView)findViewById(R.id.imageView1);
        TextView tv1 = (TextView)findViewById(R.id.name);
        TextView tv2 = (TextView)findViewById(R.id.des);
        TextView tv3 = (TextView)findViewById(R.id.price);
        Intent intent = getIntent();
        int dataID = intent.getIntExtra("DataID",0);
        Data data = DataInfo.getDataById(dataID);
        img.setImageResource(data.getImageId());
        tv1.setText(data.getName());
        tv2.setText(data.getDescription());
        tv3.setText("Price: $" + String.valueOf(data.getPrice()));
    }

    public void addNumber(View view){
        tv1 = (TextView)findViewById(R.id.number);
        number1 = Integer.parseInt(tv1.getText().toString());
        number1 = number1 + 1;
        tv1.setText(String.valueOf(number1));
    }

    public void minusNumber(View view){
        tv1 = (TextView)findViewById(R.id.number);
        number1 = Integer.parseInt(tv1.getText().toString());
        if(number1<=0){
            tv1.setText(String.valueOf(0));
        }else{
        number1 = number1 - 1;
        tv1.setText(String.valueOf(number1));
        }
    }


    public void add(View view){
        tv1 = (TextView)findViewById(R.id.number);
        Intent intent = getIntent();
        int dataID = intent.getIntExtra("DataID",0);
        list.add(String.valueOf(dataID));
        list.add(tv1.getText().toString());
        DataStore.array.add(list);
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
}
