package com.example.drakorbyhn.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drakorbyhn.R;
import com.example.drakorbyhn.SinopsisActivity;
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
        final DramaLogo item = items.get(position);
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, SinopsisActivity.class);
                i.putExtra("logo", item.getLogo());
                i.putExtra("name", item.getName());
                i.putExtra("pemeran", item.getPemeran());
                i.putExtra("sinopsis", item.getSinopsis());
                context.startActivity(i);
            }
        });
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
            logoImage = itemView.findViewById(R.id.logo);
            nameText = itemView.findViewById(R.id.name);
        }
    }
}