package com.example.joe.newsapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> news) {
        super(context, 0, news);
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.article_title);
        titleView.setText(currentNews.getArticleTitle());

        TextView authorView = (TextView) listItemView.findViewById(R.id.article_author);
        authorView.setText(currentNews.getArticleAuthor());

        Date dateObject = new Date(currentNews.getPublishedTimeInMilliseconds());
        TextView dateView = (TextView) listItemView.findViewById(R.id.publish_date);
        String formattedDate = formatDate(dateObject);
        dateView.setText(formattedDate);

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(currentNews.getArticleSection());

        TextView synopsisView = (TextView) listItemView.findViewById(R.id.article_synopsis);
        synopsisView.setText(currentNews.getArticleSynopsis());

        return listItemView;
    }
}
