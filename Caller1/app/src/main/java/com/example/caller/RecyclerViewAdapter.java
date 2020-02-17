package com.example.caller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mcontext;
    List<Contact> mData;

    public RecyclerViewAdapter(Context mcontext, List<Contact> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mcontext).inflate(R.layout.data_design,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(mData.get(position).getImage());
        holder.Names.setText(mData.get(position).getName());
        holder.About.setText(mData.get(position).getDetail());








    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView Names,About;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image=(ImageView) itemView.findViewById(R.id.item_image);
            Names=(TextView) itemView.findViewById(R.id.item_name);
            About=(TextView) itemView.findViewById(R.id.item_place);



        }
    }
}
