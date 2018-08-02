package com.example.dsm2018.home_application;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Recycler extends RecyclerView.Adapter<Recycler.ViewHolder>{
    Context context;
    ArrayList<RecyclerItem> singModel;
    int recycler_item;


    public Recycler(ArrayList<RecyclerItem> singModels) {
        this.context = context;
        this.singModel = singModels;
        this.recycler_item=recycler_item;
    }
    @NonNull
    public Recycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull Recycler.ViewHolder holder, int position) {
        RecyclerItem recyclerItem=singModel.get(position);
        holder.main_title.setText(recyclerItem.getMain_title());
        holder.sub_title.setText(recyclerItem.getSub_title());
        holder.userid.setText(recyclerItem.getUserid());
        holder.image.setImageResource(recyclerItem.getImage());
    }

    public int getItemCount() {
        return singModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView main_title,sub_title,userid;
        ImageView image;
        public ViewHolder(View itemView) {
            super(itemView);
            main_title=(TextView)itemView.findViewById(R.id.main_title);
            sub_title=(TextView)itemView.findViewById(R.id.sub_title);
            userid=(TextView)itemView.findViewById(R.id.userid);
            image=(ImageView)itemView.findViewById(R.id.image);
        }
    }
}
