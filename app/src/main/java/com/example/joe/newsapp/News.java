package com.example.joe.newsapp;

public class News {

    private String articleTitle;

    private String articleAuthor;

    private long publishedTimeInMilliseconds;

    private String articleSection;

    private String articleSynopsis;

    private String articleUrl;

    public News(String title, String author, long timeInMilliseconds, String section, String synopsis, String url) {
        articleTitle = title;
        articleAuthor = author;
        publishedTimeInMilliseconds = timeInMilliseconds;
        articleSection = section;
        articleSynopsis = synopsis;
        articleUrl = url;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public long getPublishedTimeInMilliseconds() {
        return publishedTimeInMilliseconds;
    }

    public String getArticleSection() {
        return articleSection;
    }

    public String getArticleSynopsis() {
        return articleSynopsis;
    }

    public String getArticleUrl() {
        return articleUrl;
    }
}
