package com.example.loadmylist.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loadmylist.R;
import com.example.loadmylist.model.*;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    List<Animal> animals;
    public AnimalAdapter(List<Animal> Animals) {
        this.animals = Animals;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View theView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.animal_item,parent,false);
        return new AnimalViewHolder(theView);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {

        Animal currentAnimal = animals.get(position);

        holder.tvName.setText(currentAnimal.getName());
        holder.tvType.setText(currentAnimal.getType());
        holder.tvIsAdult.setText(String.valueOf(currentAnimal.isAdult()));
        holder.tvDateAdopted.setText(currentAnimal.getDateOfAdoption().toString());

    }

    @Override
    public int getItemCount() {
        return animals.size();
    }

    protected class AnimalViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvType, tvLegCount, tvIsAdult, tvDateAdopted;
        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvType = itemView.findViewById(R.id.tv_type);
            tvLegCount = itemView.findViewById(R.id.tv_leg_count);
            tvIsAdult = itemView.findViewById(R.id.tv_is_adult);
            tvDateAdopted = itemView.findViewById(R.id.tv_date_of_adoption);
        }
    }
}
