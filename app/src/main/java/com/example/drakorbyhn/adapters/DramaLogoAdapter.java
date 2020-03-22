package com.example.drakorbyhn.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drakorbyhn.R;
import com.example.drakorbyhn.models.DramaLogo;

import java.util.List;

public class DramaLogoAdapter extends RecyclerView.Adapter {
    private Context context;
    private List<DramaLogo> items;

    public DramaLogoAdapter(ImageView logoImage, TextView nameText) {
        this.logoImage = logoImage;
        this.nameText = nameText;
    }

    ImageView logoImage;
    TextView nameText;

    @NonNull
    @Override
    public DramaLogoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_logo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    public DramaLogoAdapter(Context context, List<DramaLogo> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public void onBindViewHolder(@NonNull DramaLogoAdapter.ViewHolder holder, int position) {
        DramaLogo item = items.get(position);
        // Atur image di baris ini, dapat menggunakan Picasso atau Glide
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
        return (items != null)? items.size() : 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameText;
        public ImageView logoImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}
