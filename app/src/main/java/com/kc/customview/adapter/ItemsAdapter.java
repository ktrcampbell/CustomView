package com.kc.customview.adapter;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;

import com.kc.customview.R;
import com.kc.customview.view.CustomItemView;
import com.kc.customview.model.MyItems;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemViewHolder> {

    private List<MyItems> itemsList;

    public ItemsAdapter(List<MyItems> itemsList){
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        MyItems items  = itemsList.get(position);
        holder.leftImageView.setImageResource(items.getImage());
        holder.textView.setText(items.getText());
        holder.chevronImageView.setImageResource(R.drawable.ic_chevron_right);
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView leftImageView;
        TextView textView;
        ImageView chevronImageView;


        private CustomItemView customItemView;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
