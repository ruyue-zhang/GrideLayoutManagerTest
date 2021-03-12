package com.ruyue.readinghabits;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class BookInfoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_LIGHT = 0;
    private static final int TYPE_CONTENT = 1;
    private static final int TYPE_DIVIDE = 2;

    static class BookInfoViewHolder extends RecyclerView.ViewHolder {

        public BookInfoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    static class DivideViewHolder extends RecyclerView.ViewHolder {

        public DivideViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    static class LightViewHolder extends RecyclerView.ViewHolder {

        public LightViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if(viewType == TYPE_LIGHT) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_light, parent, false);
            return new LightViewHolder(view);
        } else if(viewType == TYPE_CONTENT){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_holder, parent, false);
            return new BookInfoViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_divide, parent, false);
            return new DivideViewHolder(view);
        }

    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 4 == 0) {
            return TYPE_LIGHT;
        } else if (position % 4 == 3) {
            return TYPE_DIVIDE;
        } else {
            return TYPE_CONTENT;
        }
    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
