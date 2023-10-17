package com.example.telegramdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class Adopter extends RecyclerView.Adapter<Adopter.ViewHolder> {
//    Profile context;
     List<User> items;

    public Adopter( List<User> items) {
//        this.context = context;
        this.items = items;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_profile,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.fullName.setText(items.get(position).getName());
        holder.email.setText(items.get(position).getEmail());
//        Toast.makeText(context,items.get(position).getName(),Toast.LENGTH_SHORT).show();

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView fullName,email;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fullName = itemView.findViewById(R.id.fulpname);
            email = itemView.findViewById(R.id.Pemail);
        }
    }
}
