package com.example.foster.data;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.caller.R;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ArrayList<Data> list;

    public ListAdapter(ArrayList<Data> list) {
        this.list = list;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.item_foster, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Data data = list.get(position);
        holder.ivLogo.setImageResource(data.getLogo());
        holder.tvTitle.setText(data.getTitle());
        holder.tvSubTitle1.setText(data.getSubTitle1());
        holder.tvSubTitle2.setText(data.getSubTitle2());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivLogo;
        public TextView tvTitle;
        public TextView tvSubTitle1;
        public TextView tvSubTitle2;
        public CardView cvRoot;

        public ViewHolder(View itemView) {
            super(itemView);
            this.ivLogo = itemView.findViewById(R.id.ivLogo);
            this.tvTitle = itemView.findViewById(R.id.tvTitle);
            this.tvSubTitle1 = itemView.findViewById(R.id.tvStatus1);
            this.tvSubTitle2 = itemView.findViewById(R.id.tvStatus2);
            this.cvRoot = itemView.findViewById(R.id.cv_root);
            cvRoot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Data data = list.get(getAdapterPosition());

                    Toast.makeText(cvRoot.getContext(), data.getTitle(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}