package com.example.joe.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = listItemView.findViewById(R.id.article_title);
        titleView.setText(currentNews.getArticleTitle());

        TextView authorView = listItemView.findViewById(R.id.article_author);
        authorView.setText(currentNews.getArticleAuthor());

        TextView dateView = listItemView.findViewById(R.id.publish_date);
        dateView.setText(currentNews.getPublishedDate());

        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(currentNews.getArticleSection());

        TextView synopsisView = listItemView.findViewById(R.id.article_synopsis);
        synopsisView.setText(currentNews.getArticleSynopsis());

        return listItemView;
    }
}
