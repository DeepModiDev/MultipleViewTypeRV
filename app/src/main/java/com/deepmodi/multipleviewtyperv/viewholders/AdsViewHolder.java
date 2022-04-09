package com.deepmodi.multipleviewtyperv.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.deepmodi.multipleviewtyperv.R;

public class AdsViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView heading;
    public TextView link;

    public AdsViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.adsTitle);
        heading = itemView.findViewById(R.id.adsHeading);
        link = itemView.findViewById(R.id.link);
    }
}
