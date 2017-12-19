package com.example.root.chatview;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.root.chatview.R.id.txtTitle;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder> {


    private String[] data;
    public ProgrammingAdapter(String[] data)
    {
        this.data=data;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0)
            {
            return 1;
            }
            else
            {
                return 2;
            }
    }


    @Override
    public ProgrammingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        switch (viewType){
            case 1:
                View viewONE = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
                ProgrammingViewHolder rowOne= new ProgrammingViewHolder(viewONE);
                return rowOne;

            case 2:
                View viewTWO = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_reply_layout, parent, false);
                ProgrammingViewHolder rowTwo=new ProgrammingViewHolder(viewTWO);
                return rowTwo;



        }
        return null;


    }

    @Override
    public void onBindViewHolder(ProgrammingViewHolder holder, int position) {
        String title=data[position];
        holder.txtTitle.setText(title);

        final int pos=position*2;



    }



    @Override
    public int getItemCount() {
        return data.length;
    }

    class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView imgIcon;
        TextView txtTitle;
        public ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgIcon= itemView.findViewById(R.id.imgIcon);
            txtTitle= itemView.findViewById(R.id.txtTitle);

        }
    }
}
