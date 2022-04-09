package com.deepmodi.multipleviewtyperv.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.deepmodi.multipleviewtyperv.R;
import com.deepmodi.multipleviewtyperv.models.Data;
import com.deepmodi.multipleviewtyperv.viewholders.AdsViewHolder;
import com.deepmodi.multipleviewtyperv.viewholders.StoriesViewHolder;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Data> dataList;
    private final int ADS_VIEW_TYPE_ID = 0;
    private final int STORIES_VIEW_TYPE_ID = 1;

    public DataAdapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == ADS_VIEW_TYPE_ID){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_ads,parent,false);
            return new AdsViewHolder(view);
        }else{
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview_stories,parent,false);
            return new StoriesViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (dataList.get(position).getViewType().trim().equals("ad")){
            ((AdsViewHolder)holder).heading.setText(dataList.get(position).getAds().getAdsHeading());
            ((AdsViewHolder)holder).title.setText(dataList.get(position).getAds().getAdsTitle());
            ((AdsViewHolder)holder).link.setText(dataList.get(position).getAds().getLink());
        }else{
            ((StoriesViewHolder)holder).author.setText(dataList.get(position).getStories().getAuthorName());
            ((StoriesViewHolder)holder).subtitle.setText(dataList.get(position).getStories().getSubTitle());
            ((StoriesViewHolder)holder).title.setText(dataList.get(position).getStories().getTitle());
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (dataList.get(position).getViewType().trim().equals("ad")){
            return ADS_VIEW_TYPE_ID;
        }else{
            return STORIES_VIEW_TYPE_ID;
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
