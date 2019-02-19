package com.example.apple.butterkniferecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    TextView name,add;
    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.txt_name);
        add= itemView.findViewById(R.id.txt_add);
    }
}
