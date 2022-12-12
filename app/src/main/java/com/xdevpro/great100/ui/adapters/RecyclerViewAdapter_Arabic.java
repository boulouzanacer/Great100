package com.xdevpro.great100.ui.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import com.xdevpro.great100.R;
import com.xdevpro.great100.ui.MainActivityPlayer;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by UK2016 on 02/05/2018.
 */

public class RecyclerViewAdapter_Arabic extends RecyclerView.Adapter<RecyclerViewAdapter_Arabic.ViewHolder> {
    private String[] videoIds;
    private String[] videoTitles;
    private String[] videoTimes;
    public Context mContext;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(String youtube_id);
    }

    public RecyclerViewAdapter_Arabic(String[] videoIds, String[] videoTitles, String[] videoTimes, Activity activity, OnItemClickListener listener) {
        this.videoIds = videoIds;
        this.videoTitles = videoTitles;
        this.videoTimes = videoTimes;
        this.mContext = activity;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_view_item1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return videoIds.length;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.bind(videoTitles[position], videoIds[position], videoTimes[position], listener);
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView videoTitle;
        private final TextView videoTime;
        private CardView cardview;


        ViewHolder(View view) {
            super(view);
            videoTitle = (TextView) view.findViewById(R.id.videoTitle);
            videoTime = (TextView) view.findViewById(R.id.time);
            cardview = (CardView) view.findViewById(R.id.cardview);
        }
        public void bind(final String youtube_title, final String youtube_id, final String youtube_time, final OnItemClickListener listener) {
            videoTitle.setText(youtube_title);
            videoTime.setText(youtube_time);
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(youtube_id);
                }
            });
        }
    }
}

