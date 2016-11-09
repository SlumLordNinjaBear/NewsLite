package com.example.android.newslite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Unicron on 10/25/2016.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> newsArrayList) {
        super(context, 0, newsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        News news = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView titleTV = (TextView) convertView.findViewById(R.id.title);
        TextView authorTV = (TextView) convertView.findViewById(R.id.author);
        TextView sectionNameTV = (TextView)convertView.findViewById(R.id.sectionName);

        titleTV.setText(news.getTitle());
        authorTV.setText(news.getAuthor());
        sectionNameTV.setText(news.getSectionName());

        return convertView;
    }}