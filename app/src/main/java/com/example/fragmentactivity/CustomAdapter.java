package com.example.fragmentactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{
    ArrayList<EntityNews> newsArrayList;
    Context context;

    public CustomAdapter(ArrayList<EntityNews> newsArrayList, Context context) {
        this.newsArrayList = newsArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(parent.getContext());
        View view = li.inflate(R.layout.entity_news,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ImageView img_tumb = holder.img_tumb;
        TextView tv_headline = holder.tv_headline;
        TextView tv_description = holder.tv_description;
        TextView tv_deadline = holder.tv_deadline;
        ImageView img_more = holder.img_more;

        tv_headline.setText(newsArrayList.get(position).namaTugas+"");
        tv_description.setText(newsArrayList.get(position).Deskripsi+"");
        tv_deadline.setText(newsArrayList.get(position).Deadline+"");
    }

    @Override
    public int getItemCount() {
        return newsArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img_tumb;
        TextView tv_headline;
        TextView tv_description;
        TextView tv_deadline;
        ImageView img_more;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.img_tumb = (ImageView) itemView.findViewById(R.id.img_tumb);
            this.tv_headline = (TextView) itemView.findViewById(R.id.text_headline);
            this.tv_description = (TextView) itemView.findViewById(R.id.text_description);
            this.tv_deadline = (TextView) itemView.findViewById(R.id.text_deadline);
            this.img_more = (ImageView) itemView.findViewById(R.id.img_more);
        }
    }
}
