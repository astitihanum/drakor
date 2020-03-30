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
import com.squareup.picasso.Picasso;

import java.util.List;

public class DramaLogoAdapter extends RecyclerView.Adapter<DramaLogoAdapter.ViewHolder> {

    private Context context;
    private List<DramaLogo> items;

    public DramaLogoAdapter(Context context, List<DramaLogo> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public DramaLogoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_logo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DramaLogo item = items.get(position);
        //ATUR IMAGE DIBARIS INI, DAPAT MENGGUNAKAN PICASSO ATAU GLIDE
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.nameText.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return (items != null) ? items.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
        }
    }
}