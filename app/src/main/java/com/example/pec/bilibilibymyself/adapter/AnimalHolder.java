package com.example.pec.bilibilibymyself.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pec.bilibilibymyself.R;
import com.example.pec.bilibilibymyself.bean.Animal;

public class AnimalHolder extends RecyclerView.ViewHolder {
    private ImageView imageVie;
    private TextView textView;
    public AnimalHolder(View itemView){
        super(itemView);
        imageVie = itemView.findViewById(R.id.image_view);
        textView = itemView.findViewById(R.id.text_view);
    }

    public void bindView(Animal animal){
        imageVie.setImageResource(animal.getImage());
        textView.setText(animal.getTitle());

    }
}
