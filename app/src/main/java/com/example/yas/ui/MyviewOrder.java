package com.example.yas.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yas.R;

public class MyviewOrder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView name,email;

    public MyviewOrder(@NonNull View itemView) {
        super(itemView);

        img=itemView.findViewById(R.id.imge);
        name=itemView.findViewById(R.id.text);
        email=itemView.findViewById(R.id.emel);
    }
}
