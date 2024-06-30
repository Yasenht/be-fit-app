package com.example.yas.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.example.yas.R;
import com.example.yas.ui.Item;
import com.example.yas.ui.MyviewOrder;

import java.util.List;

public class Myadabter extends RecyclerView.Adapter<MyviewOrder> {
    Context context;
    List<Item> items;

    public Myadabter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public MyviewOrder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new MyviewOrder(LayoutInflater.from(context).inflate(R.layout.item_veiw,parent,false));
    }

    @Override
    public void onBindViewHolder(MyviewOrder holder, int position) {
            holder.name.setText(items.get(position).getName());
            holder.email.setText(items.get(position).getdiscriptoion());
            holder.img.setImageResource(items.get(position).getImeg());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
