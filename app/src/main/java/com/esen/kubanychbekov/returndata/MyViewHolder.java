package com.esen.kubanychbekov.returndata;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.view_holder_text_view);
    }

    public void onBind(String text){
        textView.setText(text);

    }
}
