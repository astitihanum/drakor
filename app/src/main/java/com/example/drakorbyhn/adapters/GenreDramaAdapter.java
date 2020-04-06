package com.example.drakorbyhn.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.drakorbyhn.FantasiActivity;
import com.example.drakorbyhn.DramaActivity;
import com.example.drakorbyhn.KomediActivity;
import com.example.drakorbyhn.R;
import com.example.drakorbyhn.models.GenreDrama;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GenreDramaAdapter extends RecyclerView.Adapter<GenreDramaAdapter.ViewHolder> {
    private Context context;
    private List<GenreDrama> items;

    public GenreDramaAdapter(Context context, List<GenreDrama> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_genre_drama, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GenreDramaAdapter.ViewHolder holder, final int position) {
        final GenreDrama item = items.get(position);
        holder.nameText.setText(item.getName());
        Picasso.get().load(item.getLogo()).into(holder.logoImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (items.get(position).getRowID().matches("1")){
                    Intent go = new Intent(context, KomediActivity.class);
                    context.startActivity(go);
                } else if (items.get(position).getRowID().matches("2")){
                    Intent go = new Intent(context, DramaActivity.class);
                    context.startActivity(go);
                } else if (items.get(position).getRowID().matches("3")){
                    Intent go = new Intent(context, FantasiActivity.class);
                    context.startActivity(go);
                }
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
            logoImage = itemView.findViewById(R.id.image);
            nameText = itemView.findViewById(R.id.genre_drama);
        }
    }
}
