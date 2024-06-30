package com.example.yas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder>{
  private LayoutInflater layoutInflater;
    TextView textTitel2;
  private List<String> data;
   Adapter(Context context,List<String> data){
       this.layoutInflater=LayoutInflater.from(context);
       this.data=data;

   }



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view=layoutInflater.inflate(R.layout.custom_view,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        String title=data.get(i);
        viewHolder.textTitel.setText(title);
    }






    @Override
    public int getItemCount() {
        return data.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView textTitel,description;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textTitel=itemView.findViewById(R.id.textTitel);
             description=itemView.findViewById(R.id.description);

        }
    }
}
