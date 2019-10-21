package com.example.assignment;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageHolder>{
    public ArrayList<Data> articlesList;
    public void setData(ArrayList<Data> articles){
        this.articlesList = articles;
    }

    @Override
    public ImageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu,parent, false);
        ImageHolder imageViewHolder = new ImageHolder(view);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageHolder holder, final int position) {
        holder.img.setImageResource(articlesList.get(position).getImageId());
        holder.name.setText(articlesList.get(position).getName());
        holder.price.setText("Price: $" + (double) articlesList.get(position).getPrice());
        holder.name.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext().getApplicationContext(),selectItem.class);
                intent.putExtra("DataID", articlesList.get(position).getDataID());
                view.getContext().startActivity(intent);
            }
        });
        holder.price.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext().getApplicationContext(),selectItem.class);
                intent.putExtra("DataID", articlesList.get(position).getDataID());
                view.getContext().startActivity(intent);
            }
        });
        holder.img.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(view.getContext().getApplicationContext(),selectItem.class);
                intent.putExtra("DataID", articlesList.get(position).getDataID());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return articlesList.size();
    }

    public static class ImageHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name;
        TextView price;

        public ImageHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            price = itemView.findViewById(R.id.textView1);
        }
    }

}
