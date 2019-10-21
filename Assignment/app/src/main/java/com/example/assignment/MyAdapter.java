package com.example.assignment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserViewHolder> {
    private ArrayList<ArrayList<String>> ar;

    public void setAr(ArrayList<ArrayList<String>> data1){
        this.ar = data1;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_list,parent,false);
        UserViewHolder userViewHolder = new UserViewHolder(view);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        ArrayList<String> order = ar.get(position);
        int id = Integer.parseInt(order.get(0));
        int quantity = Integer.parseInt(order.get(1));
        Data data = DataInfo.getDataById(id);
        double price = data.getPrice();
        holder.img.setImageResource(data.getImageId());
        holder.name.setText(data.getName());
        holder.number.setText("X"+ String.valueOf(quantity));
        double sub = price * quantity;
        holder.total.setText(" Subtoal($"+ price + " each): $" + String.valueOf(sub));
    }

    @Override
    public int getItemCount() {
        return ar.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView name;
        public TextView number;
        public TextView total;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.name1);
            number = itemView.findViewById(R.id.number1);
            total = itemView.findViewById(R.id.sub);
        }
    }
}
