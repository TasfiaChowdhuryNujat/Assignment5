package com.nujat.assignment5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private Context context;
    private List<Item> itemList;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.mainImage.setImageResource(item.getMainImage());
        holder.title.setText(item.getTitle());
        holder.subtitle.setText(item.getSubtitle());
        holder.description.setText(item.getDescription());
        holder.iconImage.setImageResource(item.getIconImage());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView mainImage, iconImage;
        TextView title, subtitle, description;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mainImage = itemView.findViewById(R.id.mainImage);
            title = itemView.findViewById(R.id.title);
            subtitle = itemView.findViewById(R.id.subtitle);
            description = itemView.findViewById(R.id.description);
            iconImage = itemView.findViewById(R.id.iconImage);
        }
    }
}
