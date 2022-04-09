package com.deepmodi.multipleviewtyperv.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.deepmodi.multipleviewtyperv.R;

public class StoriesViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView subtitle;
    public TextView author;

    public StoriesViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.storyTitle);
        subtitle = itemView.findViewById(R.id.storySubTitle);
        author = itemView.findViewById(R.id.author);
    }
}
